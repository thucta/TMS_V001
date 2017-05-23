package com.fsoft.gst.ptithcm.tms.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



// TODO: Auto-generated Javadoc
/**
 * The Class Users.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "USERS", schema = "dbo", catalog = "TMS")
public class Users implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private int id;
	
	/** The user id. */
	private String userId;
	
	/** The log. */
	private Log log;
	
	/** The role. */
	private Role role;
	
	/** The trainee courses. */
	private Set<TraineeCourse> traineeCourses = new HashSet<TraineeCourse>(0);
	
	/** The profile users. */
	private Set<ProfileUser> profileUsers = new HashSet<ProfileUser>(0);
	
	/** The topics. */
	private Set<Topic> topics = new HashSet<Topic>(0);
	
	

	/**
	 * Instantiates a new users.
	 */
	public Users() {
	}

	/**
	 * Instantiates a new users.
	 *
	 * @param userId the user id
	 * @param log the log
	 * @param role the role
	 */
	public Users(String userId, Log log, Role role) {
		this.userId = userId;
		this.log = log;
		this.role = role;
	}
	
	/**
	 * Instantiates a new users.
	 *
	 * @param id the id
	 * @param userId the user id
	 * @param log the log
	 * @param role the role
	 */
	public Users(int id,String userId, Log log, Role role) {
		this.id = id;
		this.userId = userId;
		this.log = log;
		this.role = role;
	}

	/**
	 * Instantiates a new users.
	 *
	 * @param userId the user id
	 * @param log the log
	 * @param role the role
	 * @param traineeCourses the trainee courses
	 * @param profileUsers the profile users
	 * @param topics the topics
	 */
	public Users(String userId, Log log, Role role, Set<TraineeCourse> traineeCourses, Set<ProfileUser> profileUsers, Set<Topic> topics){
		this.userId = userId;
		this.log = log;
		this.role = role;
		this.traineeCourses = traineeCourses;
		
		this.profileUsers = profileUsers;
		this.topics = topics;
		
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true,nullable=false)
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	@Column(name = "UserID", nullable = false)
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * Gets the role.
	 *
	 * @return the role
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RoleID", nullable = false)
	public Role getRole() {
		return this.role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * Gets the trainee courses.
	 *
	 * @return the trainee courses
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
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

	

	/**
	 * Gets the profile users.
	 *
	 * @return the profile users
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<ProfileUser> getProfileUsers() {
		return this.profileUsers;
	}

	/**
	 * Sets the profile users.
	 *
	 * @param profileUsers the new profile users
	 */
	public void setProfileUsers(Set<ProfileUser> profileUsers) {
		this.profileUsers = profileUsers;
	}

	/**
	 * Gets the topics.
	 *
	 * @return the topics
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
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

	

}
