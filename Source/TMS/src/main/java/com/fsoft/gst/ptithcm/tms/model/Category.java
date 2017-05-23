package com.fsoft.gst.ptithcm.tms.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author NVTT May 13, 2017.
 */
@Entity
@Table(name = "CATEGORY", schema = "dbo", catalog = "TMS")
public class Category implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The category id. */
	private String categoryId;

	/** The name. */
	private String name;

	/** The description. */
	private String description;

	/** The log. */
	private Log log;

	/** The courses. */
	private Set<Course> courses = new HashSet<Course>(0);

	/**
	 * Instantiates a new category.
	 */
	public Category() {
	}

	/**
	 * Instantiates a new category.
	 *
	 * @param categoryId
	 *            the category id
	 * @param log
	 *            the log
	 * @param name
	 *            the name
	 */
	public Category(String categoryId, Log log, String name) {
		this.categoryId = categoryId;
		this.log = log;
		this.name = name;
	}

	/**
	 * Instantiates a new category.
	 *
	 * @param categoryId
	 *            the category id
	 * @param log
	 *            the log
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param courses
	 *            the courses
	 */
	public Category(String categoryId, Log log, String name, String description, Set<Course> courses) {
		this.categoryId = categoryId;
		this.log = log;
		this.name = name;
		this.description = description;
		this.courses = courses;
	}

	/**
	 * Gets the category id.
	 *
	 * @return the category id
	 */

	@Id
	@Column(name = "CategoryID", unique = true, nullable = false)
	public String getCategoryId() {
		return this.categoryId;
	}

	/**
	 * Sets the category id.
	 *
	 * @param categoryId
	 *            the new category id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Gets the log.
	 *
	 * @return the log
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LogID", nullable = false)
	public Log getLog() {
		return this.log;
	}

	/**
	 * Sets the log.
	 *
	 * @param log
	 *            the new log
	 */
	public void setLog(Log log) {
		this.log = log;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name = "Name", unique = true, nullable = false)
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the courses.
	 *
	 * @return the courses
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Course> getCourses() {
		return this.courses;
	}

	/**
	 * Sets the courses.
	 *
	 * @param courses
	 *            the new courses
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
