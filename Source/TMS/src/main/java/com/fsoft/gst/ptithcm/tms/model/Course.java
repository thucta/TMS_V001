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
 * The Class Course.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "COURSE", schema = "dbo", catalog = "TMS")
public class Course implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course id. */
	private String courseId;
	
	/** The category. */
	private Category category;
	
	/** The log. */
	private Log log;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The topics. */
	private Set<Topic> topics = new HashSet<Topic>(0);
	
	/** The trainee courses. */
	private Set<TraineeCourse> traineeCourses = new HashSet<TraineeCourse>(0);

	/**
	 * Instantiates a new course.
	 */
	public Course() {
	}

	/**
	 * Instantiates a new course.
	 *
	 * @param courseId the course id
	 * @param category the category
	 * @param log the log
	 * @param name the name
	 */
	public Course(String courseId, Category category, Log log, String name) {
		this.courseId = courseId;
		this.category = category;
		this.log = log;
		this.name = name;
	}

	/**
	 * Instantiates a new course.
	 *
	 * @param courseId the course id
	 * @param category the category
	 * @param log the log
	 * @param name the name
	 * @param description the description
	 * @param topics the topics
	 * @param traineeCourses the trainee courses
	 */
	public Course(String courseId, Category category, Log log, String name, String description,
			Set<Topic> topics, Set<TraineeCourse> traineeCourses) {
		this.courseId = courseId;
		this.category = category;
		this.log = log;
		this.name = name;
		this.description = description;
		this.topics = topics;
		this.traineeCourses = traineeCourses;
	}

	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	@Id

	@Column(name = "CourseID", unique = true, nullable = false)
	public String getCourseId() {
		return this.courseId;
	}

	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CategoryID", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(Category category) {
		this.category = category;
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
	 * @param log the new log
	 */
	public void setLog(Log log) {
		this.log = log;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name = "Name", nullable = false)
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
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
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the topics.
	 *
	 * @return the topics
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<Topic> getTopics() {
		return this.topics;
	}

	/**
	 * Sets the topics.
	 *
	 * @param topics the new topics
	 */
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	/**
	 * Gets the trainee courses.
	 *
	 * @return the trainee courses
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public Set<TraineeCourse> getTraineeCourses() {
		return this.traineeCourses;
	}

	/**
	 * Sets the trainee courses.
	 *
	 * @param traineeCourses the new trainee courses
	 */
	public void setTraineeCourses(Set<TraineeCourse> traineeCourses) {
		this.traineeCourses = traineeCourses;
	}

}
