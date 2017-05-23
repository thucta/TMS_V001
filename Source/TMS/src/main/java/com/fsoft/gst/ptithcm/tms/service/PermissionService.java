/**
 * 
 */
package com.fsoft.gst.ptithcm.tms.service;

import java.util.List;

import com.fsoft.gst.ptithcm.tms.model.Permission;


/**
 * The Interface PermissionService.
 *
 * @author NVTT May 13, 2017
 */
public interface PermissionService {
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the permission
	 */
	Permission findById(String id);

	/**
	 * Save permission.
	 *
	 * @param permission the permission
	 */
	void savePermission(Permission permission);

	/**
	 * Update permission.
	 *
	 * @param permission the permission
	 */
	void updatePermission(Permission permission);

	/**
	 * Delete permission by ID.
	 *
	 * @param id the id
	 */
	void deletePermissionByID(String id);

	/**
	 * Find all users.
	 *
	 * @return the list
	 */
	List<Permission> findAllUsers();

}
