package com.fsoft.gst.ptithcm.tms.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "TRAINEE_COURSE", schema = "dbo", catalog = "TMS")
public class TraineeCourse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TraineeCourseId id;
	private Course course;
	private Log log;
	private Users users;

	public TraineeCourse() {
	}

	public TraineeCourse(TraineeCourseId id, Course course, Log log, Users users) {
		this.id = id;
		this.course = course;
		this.log = log;
		this.users = users;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "trainee", column = @Column(name = "Trainee", nullable = false)),
			@AttributeOverride(name = "courseId", column = @Column(name = "CourseID", nullable = false)) })
	public TraineeCourseId getId() {
		return this.id;
	}

	public void setId(TraineeCourseId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CourseID", nullable = false, insertable = false, updatable = false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LogID", nullable = false)
	public Log getLog() {
		return this.log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Trainee", nullable = false, insertable = false, updatable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
