package com.fsoft.gst.ptithcm.tms.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The Class Permission.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "PERMISSION", schema = "dbo", catalog = "TMS")
public class Permission implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private String id;
	
	/** The log. */
	private Log log;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The role permisstions. */
	private Set<RolePermisstion> rolePermisstions = new HashSet<RolePermisstion>(0);

	/**
	 * Instantiates a new permission.
	 */
	public Permission() {
	}

	/**
	 * Instantiates a new permission.
	 *
	 * @param id the id
	 * @param log the log
	 * @param name the name
	 */
	public Permission(String id, Log log, String name) {
		this.id = id;
		this.log = log;
		this.name = name;
	}

	/**
	 * Instantiates a new permission.
	 *
	 * @param id the id
	 * @param log the log
	 * @param name the name
	 * @param description the description
	 * @param rolePermisstions the role permisstions
	 */
	public Permission(String id, Log log, String name, String description,
			Set<RolePermisstion> rolePermisstions) {
		this.id = id;
		this.log = log;
		this.name = name;
		this.description = description;
		this.rolePermisstions = rolePermisstions;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the log.
	 *
	 * @return the log
	 */
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "LogID",  nullable = false)
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
	 * Gets the role permisstions.
	 *
	 * @return the role permisstions
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permission")
	public Set<RolePermisstion> getRolePermisstions() {
		return this.rolePermisstions;
	}

	/**
	 * Sets the role permisstions.
	 *
	 * @param rolePermisstions the new role permisstions
	 */
	public void setRolePermisstions(Set<RolePermisstion> rolePermisstions) {
		this.rolePermisstions = rolePermisstions;
	}

}
