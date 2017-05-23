package com.fsoft.gst.ptithcm.tms.model;
// Generated May 13, 2017 5:20:16 PM by Hibernate Tools 4.3.1.Final


import java.io.Serializable;
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
 * The Class Profile.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "PROFILE", schema = "dbo", catalog = "TMS")
public class Profile implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The property id. */
	private int propertyId;
	
	/** The log. */
	private Log log;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The profile users. */
	private Set<ProfileUser> profileUsers = new HashSet<ProfileUser>(0);

	/**
	 * Instantiates a new profile.
	 */
	public Profile() {
	}

	/**
	 * Instantiates a new profile.
	 *
	 * @param propertyId the property id
	 * @param log the log
	 * @param name the name
	 */
	public Profile(int propertyId, Log log, String name) {
		this.propertyId = propertyId;
		this.log = log;
		this.name = name;
	}

	/**
	 * Instantiates a new profile.
	 *
	 * @param propertyId the property id
	 * @param log the log
	 * @param name the name
	 * @param description the description
	 * @param profileUsers the profile users
	 */
	public Profile(int propertyId, Log log, String name, String description,
			Set<ProfileUser> profileUsers) {
		this.propertyId = propertyId;
		this.log = log;
		this.name = name;
		this.description = description;
		this.profileUsers = profileUsers;
	}

	/**
	 * Gets the property id.
	 *
	 * @return the property id
	 */
	@Id

	@Column(name = "PropertyID", unique = true, nullable = false)
	public int getPropertyId() {
		return this.propertyId;
	}

	/**
	 * Sets the property id.
	 *
	 * @param propertyId the new property id
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
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
	 * Gets the profile users.
	 *
	 * @return the profile users
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
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

}
