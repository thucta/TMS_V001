package com.fsoft.gst.ptithcm.tms.model;
// Generated May 13, 2017 5:20:16 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The Class Log.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "LOG", schema = "dbo", catalog = "TMS")
public class Log implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The log id. */
	private int logId;
	
	/** The users by last modified by. */
	private Users usersByLastModifiedBy;
	
	/** The users by created by. */
	private Users usersByCreatedBy;
	
	/** The created date. */
	private Date createdDate;
	
	/** The last modified date. */
	private Date lastModifiedDate;
	
	/** The flag delete. */
	private boolean flagDelete;
	
	

	/**
	 * Instantiates a new log.
	 */
	public Log() {
	}

	/**
	 * Instantiates a new log.
	 *
	 * @param logId the log id
	 * @param usersByLastModifiedBy the users by last modified by
	 * @param usersByCreatedBy the users by created by
	 * @param createdDate the created date
	 * @param lastModifiedDate the last modified date
	 * @param flagDelete the flag delete
	 */
	public Log(int logId, Users usersByLastModifiedBy, Users usersByCreatedBy, Date createdDate, Date lastModifiedDate,
			boolean flagDelete) {
		this.logId = logId;
		this.usersByLastModifiedBy = usersByLastModifiedBy;
		this.usersByCreatedBy = usersByCreatedBy;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.flagDelete = flagDelete;
	}

	/**
	 * Instantiates a new log.
	 *
	 * @param logId the log id
	 * @param usersByLastModifiedBy the users by last modified by
	 * @param usersByCreatedBy the users by created by
	 * @param createdDate the created date
	 * @param lastModifiedDate the last modified date
	 * @param flagDelete the flag delete
	 * @param traineeCourses the trainee courses
	 * @param roles the roles
	 * @param profileUsers the profile users
	 * @param permissions the permissions
	 * @param profiles the profiles
	 * @param courses the courses
	 * @param rolePermisstions the role permisstions
	 * @param userses the userses
	 * @param topics the topics
	 * @param categories the categories
	 */
	public Log(int logId, Users usersByLastModifiedBy, Users usersByCreatedBy, Date createdDate, Date lastModifiedDate,
			boolean flagDelete, Set<TraineeCourse> traineeCourses, Set<Role> roles, Set<ProfileUser> profileUsers,
			Set<Permission> permissions, Set<Profile> profiles, Set<Course> courses,
			Set<RolePermisstion> rolePermisstions, Set<Users> userses, Set<Topic> topics, Set<Category> categories) {
		this.logId = logId;
		this.usersByLastModifiedBy = usersByLastModifiedBy;
		this.usersByCreatedBy = usersByCreatedBy;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.flagDelete = flagDelete;
		
	}

	/**
	 * Gets the log id.
	 *
	 * @return the log id
	 */
	@Id

	@Column(name = "LogID", unique = true, nullable = false)
	public int getLogId() {
		return this.logId;
	}

	/**
	 * Sets the log id.
	 *
	 * @param logId the new log id
	 */
	public void setLogId(int logId) {
		this.logId = logId;
	}

	/**
	 * Gets the users by last modified by.
	 *
	 * @return the users by last modified by
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LastModifiedBY", nullable = false)
	public Users getUsersByLastModifiedBy() {
		return this.usersByLastModifiedBy;
	}

	/**
	 * Sets the users by last modified by.
	 *
	 * @param usersByLastModifiedBy the new users by last modified by
	 */
	public void setUsersByLastModifiedBy(Users usersByLastModifiedBy) {
		this.usersByLastModifiedBy = usersByLastModifiedBy;
	}

	/**
	 * Gets the users by created by.
	 *
	 * @return the users by created by
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CreatedBy", nullable = false)
	public Users getUsersByCreatedBy() {
		return this.usersByCreatedBy;
	}

	/**
	 * Sets the users by created by.
	 *
	 * @param usersByCreatedBy the new users by created by
	 */
	public void setUsersByCreatedBy(Users usersByCreatedBy) {
		this.usersByCreatedBy = usersByCreatedBy;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "CreatedDate", nullable = false, length = 10)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the last modified date.
	 *
	 * @return the last modified date
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "LastModifiedDate", nullable = false, length = 10)
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	/**
	 * Sets the last modified date.
	 *
	 * @param lastModifiedDate the new last modified date
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * Checks if is flag delete.
	 *
	 * @return true, if is flag delete
	 */
	@Column(name = "FlagDelete", nullable = false)
	public boolean isFlagDelete() {
		return this.flagDelete;
	}

	/**
	 * Sets the flag delete.
	 *
	 * @param flagDelete the new flag delete
	 */
	public void setFlagDelete(boolean flagDelete) {
		this.flagDelete = flagDelete;
	}

	

}
