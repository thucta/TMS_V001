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
 * The Class RolePermisstion.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "ROLE_PERMISSTION", schema = "dbo", catalog = "TMS")
public class RolePermisstion implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private RolePermisstionId id;
	
	/** The log. */
	private Log log;
	
	/** The permission. */
	private Permission permission;
	
	/** The role. */
	private Role role;

	/**
	 * Instantiates a new role permisstion.
	 */
	public RolePermisstion() {
	}

	/**
	 * Instantiates a new role permisstion.
	 *
	 * @param id the id
	 * @param log the log
	 * @param permission the permission
	 * @param role the role
	 */
	public RolePermisstion(RolePermisstionId id, Log log, Permission permission, Role role) {
		this.id = id;
		this.log = log;
		this.permission = permission;
		this.role = role;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "roleId", column = @Column(name = "RoleID", nullable = false)),
			@AttributeOverride(name = "permissionId", column = @Column(name = "PermissionID", nullable = false)) })
	public RolePermisstionId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(RolePermisstionId id) {
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
	 * Gets the permission.
	 *
	 * @return the permission
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PermissionID", nullable = false, insertable = false, updatable = false)
	public Permission getPermission() {
		return this.permission;
	}

	/**
	 * Sets the permission.
	 *
	 * @param permission the new permission
	 */
	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RoleID", nullable = false, insertable = false, updatable = false)
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

}
