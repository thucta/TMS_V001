package com.fsoft.gst.ptithcm.tms.model;
// Generated May 13, 2017 5:20:16 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



/**
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "TOPIC", schema = "dbo", catalog = "TMS", uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Topic implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The topic id. */
	private String topicId;
	
	/** The course. */
	private Course course;
	
	/** The log. */
	private Log log;
	
	/** The users. */
	private Users users;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;

	/**
	 * Instantiates a new topic.
	 */
	public Topic() {
	}

	/**
	 * Instantiates a new topic.
	 *
	 * @param topicId the topic id
	 * @param course the course
	 * @param log the log
	 * @param name the name
	 */
	public Topic(String topicId, Course course, Log log, String name) {
		this.topicId = topicId;
		this.course = course;
		this.log = log;
		this.name = name;
	}

	/**
	 * Instantiates a new topic.
	 *
	 * @param topicId the topic id
	 * @param course the course
	 * @param log the log
	 * @param users the users
	 * @param name the name
	 * @param description the description
	 */
	public Topic(String topicId, Course course, Log log, Users users, String name, String description) {
		this.topicId = topicId;
		this.course = course;
		this.log = log;
		this.users = users;
		this.name = name;
		this.description = description;
	}

	/**
	 * Gets the topic id.
	 *
	 * @return the topic id
	 */
	@Id

	@Column(name = "TopicID", unique = true, nullable = false, length = 10)
	public String getTopicId() {
		return this.topicId;
	}

	/**
	 * Sets the topic id.
	 *
	 * @param topicId the new topic id
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	/**
	 * Gets the course.
	 *
	 * @return the course
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CourseID", nullable = false)
	public Course getCourse() {
		return this.course;
	}

	/**
	 * Sets the course.
	 *
	 * @param course the new course
	 */
	public void setCourse(Course course) {
		this.course = course;
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
	 * Gets the users.
	 *
	 * @return the users
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TrainerID")
	public Users getUsers() {
		return this.users;
	}

	/**
	 * Sets the users.
	 *
	 * @param users the new users
	 */
	public void setUsers(Users users) {
		this.users = users;
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
	public Serializable getDescription() {
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

}
