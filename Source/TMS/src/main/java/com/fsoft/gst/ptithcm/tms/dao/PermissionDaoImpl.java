package com.fsoft.gst.ptithcm.tms.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import com.fsoft.gst.ptithcm.tms.model.Permission;
 

/**
 * The Class PermissionDaoImpl.
 *
 * @author NVTT May 13, 2017
 */
 
@Repository("permissionDao")
public class PermissionDaoImpl extends AbstractDao<String, Permission> implements PermissionDao {

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.dao.PermissionDao#findById(int)
	 */
	@Override
	public Permission findById(String id) {
		  Permission permission = getByKey(id);
	        if(permission!=null){
	            Hibernate.initialize(permission.getName());
	        }
	        return permission;
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.dao.PermissionDao#save(com.fsoft.gst.ptithcm.tms.model.Permission)
	 */
	@Override
	public void save(Permission permisstion) {
		persist(permisstion);
		
	}

	
	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.dao.PermissionDao#findAllUsers()
	 */
	@Override
	public List<Permission> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.dao.PermissionDao#deleteByID(java.lang.String)
	 */
	@Override
	public void deleteByID(String id) {
		// TODO Auto-generated method stub
		
	}
 
 
 
}