package com.fsoft.gst.ptithcm.tms.model;




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

// TODO: Auto-generated Javadoc
/**
 * The Class Role.
 *
 * @author NVTT May 13, 2017
 */
@Entity
@Table(name = "ROLE", schema = "dbo", catalog = "TMS")
public class Role implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The role id. */
	private String roleId;
	
	/** The log. */
	private Log log;
	
	/** The role name. */
	private String roleName;
	
	/** The decription. */
	private String decription;
	
	/** The userses. */
	private Set<Users> userses = new HashSet<Users>(0);
	
	/** The role permisstions. */
	private Set<RolePermisstion> rolePermisstions = new HashSet<RolePermisstion>(0);

	/**
	 * Instantiates a new role.
	 */
	public Role() {
	}

	/**
	 * Instantiates a new role.
	 *
	 * @param roleId the role id
	 * @param log the log
	 * @param roleName the role name
	 */
	public Role(String roleId, Log log, String roleName) {
		this.roleId = roleId;
		this.log = log;
		this.roleName = roleName;
	}

	/**
	 * Instantiates a new role.
	 *
	 * @param roleId the role id
	 * @param log the log
	 * @param roleName the role name
	 * @param decription the decription
	 * @param userses the userses
	 * @param rolePermisstions the role permisstions
	 */
	public Role(String roleId, Log log, String roleName, String decription, Set<Users> userses,
			Set<RolePermisstion> rolePermisstions) {
		this.roleId = roleId;
		this.log = log;
		this.roleName = roleName;
		this.decription = decription;
		this.userses = userses;
		this.rolePermisstions = rolePermisstions;
	}

	/**
	 * Gets the role id.
	 *
	 * @return the role id
	 */
	@Id

	@Column(name = "RoleID", unique = true, nullable = false)
	public Serializable getRoleId() {
		return this.roleId;
	}

	/**
	 * Sets the role id.
	 *
	 * @param roleId the new role id
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
	 * Gets the role name.
	 *
	 * @return the role name
	 */
	@Column(name = "RoleName", nullable = false)
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * Sets the role name.
	 *
	 * @param roleName the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Gets the decription.
	 *
	 * @return the decription
	 */
	@Column(name = "Decription")
	public String getDecription() {
		return this.decription;
	}

	/**
	 * Sets the decription.
	 *
	 * @param decription the new decription
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}

	/**
	 * Gets the userses.
	 *
	 * @return the userses
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<Users> getUserses() {
		return this.userses;
	}

	/**
	 * Sets the userses.
	 *
	 * @param userses the new userses
	 */
	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	/**
	 * Gets the role permisstions.
	 *
	 * @return the role permisstions
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
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
