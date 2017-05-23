/**
 * 
 */
package com.fsoft.gst.ptithcm.tms.dao;

import java.util.List;

import com.fsoft.gst.ptithcm.tms.model.Permission;

/**
 * The Interface PermissionDao.
 *
 * @author NVTT May 13, 2017
 */
public interface PermissionDao {
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the permission
	 */
	Permission findById(String id);

	/**
	 * Save.
	 *
	 * @param user the user
	 */
	void save(Permission user);

	/**
	 * Delete by SSO.
	 *
	 * @param id the id
	 */
	void deleteByID(String id);

	/**
	 * Find all users.
	 *
	 * @return the list
	 */
	List<Permission> findAllUsers();
}
