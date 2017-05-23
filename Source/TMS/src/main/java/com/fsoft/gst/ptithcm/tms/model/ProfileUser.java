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

// TODO: Auto-generated Javadoc
/**
 * The Class ProfileUser.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "PROFILE_USER", schema = "dbo", catalog = "TMS")

public class ProfileUser implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private ProfileUserId id;
	
	/** The log. */
	private Log log;
	
	/** The profile. */
	private Profile profile;
	
	/** The users. */
	private Users users;
	
	/** The value. */
	private String value;

	/**
	 * Instantiates a new profile user.
	 */
	public ProfileUser() {
	}

	/**
	 * Instantiates a new profile user.
	 *
	 * @param id the id
	 * @param log the log
	 * @param profile the profile
	 * @param users the users
	 * @param value the value
	 */
	public ProfileUser(ProfileUserId id, Log log, Profile profile, Users users, String value) {
		this.id = id;
		this.log = log;
		this.profile = profile;
		this.users = users;
		this.value = value;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "profileId", column = @Column(name = "ProfileID", nullable = false)),
			@AttributeOverride(name = "userId", column = @Column(name = "UserID", nullable = false)) })
	public ProfileUserId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(ProfileUserId id) {
		this.id = id;
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
	 * Gets the profile.
	 *
	 * @return the profile
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProfileID", nullable = false, insertable = false, updatable = false)
	public Profile getProfile() {
		return this.profile;
	}

	/**
	 * Sets the profile.
	 *
	 * @param profile the new profile
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID", nullable = false, insertable = false, updatable = false)
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
	 * Gets the value.
	 *
	 * @return the value
	 */
	@Column(name = "Value", nullable = false)
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
