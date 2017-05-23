package com.fsoft.gst.ptithcm.tms.controller;


import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fsoft.gst.ptithcm.tms.model.Log;
import com.fsoft.gst.ptithcm.tms.model.Permission;
import com.fsoft.gst.ptithcm.tms.service.PermissionService;


/**
 * The Class UserManagerController.
 * @author NVTT May 13, 2017
 */
@Controller
@RequestMapping("/")
public class UserManagerController {
	
	@Autowired
	PermissionService permissionService;
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(UserManagerController.class);

	

	/**
	 * This method will list all existing users.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = { "","/","/index", "/list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
//		LOGGER.info(permissionService.findById("Read"));
		Date date = new Date();
//		Log log = new Log(1,1 ,date, date,false);
//		Permission permission = new Permission("rd", log,"Read");
//		permission.setDescription("Read Date");
//		permissionService.savePermission(permission);
//		System.out.println(permissionService.findById("Read").getName() +"dsaaaaaaaaaaaaaaaaa");
		return "index";

	}
	@RequestMapping(value = { "update" }, method = RequestMethod.GET)
	public String updateUser(ModelMap model) {
//		LOGGER.info(permissionService.findById("Read"));
		
//		Permission permission = permissionService.findById("write");
//		if(permission != null){
//			Log log = permission.getLog();
//			log.setCreatedBy("Admin");
////			permission.getLog().setCreatedBy("Admin");
//			permission.setDescription("Write permisstion");
//			permissionService.updatePermission(permission);
		
		
		
		
//		System.out.println(permissionService.findById("Read").getName() +"dsaaaaaaaaaaaaaaaaa");
		return "index";

	}
}