/**
 * 
 */
package com.fsoft.gst.ptithcm.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsoft.gst.ptithcm.tms.dao.PermissionDao;
import com.fsoft.gst.ptithcm.tms.model.Permission;


/**
 * The Class PermissionServiceImpl.
 *
 * @author NVTT May 13, 2017
 */
@Service("permissionService")
@Transactional
public class PermissionServiceImpl implements PermissionService {

	 /** The dao. */
 	@Autowired
	 private PermissionDao dao;
	 
	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.service.PermissionService#findById(int)
	 */
	@Override
	public Permission findById(String id) {
		
		return dao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.service.PermissionService#savePermission(com.fsoft.gst.ptithcm.tms.model.Permission)
	 */
	@Override
	public void savePermission(Permission permission) {
		dao.save(permission);
		
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.service.PermissionService#updatePermission(com.fsoft.gst.ptithcm.tms.model.Permission)
	 */
	@Override
	public void updatePermission(Permission permission) {
		Permission  entity = dao.findById(permission.getId());
		if(entity != null){
			entity.setLog(permission.getLog());
			entity.setName(permission.getName());
			entity.setDescription(permission.getDescription());
			dao.save(entity);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.service.PermissionService#deletePermissionByID(java.lang.String)
	 */
	@Override
	public void deletePermissionByID(String id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.fsoft.gst.ptithcm.tms.service.PermissionService#findAllUsers()
	 */
	@Override
	public List<Permission> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
