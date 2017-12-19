package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Manager;
import com.basic.query.ManagerQueryObject;
import com.basic.service.ManagerService;

public class ManagerController extends Controller{
	ManagerService managerService=new ManagerService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Manager().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		ManagerQueryObject qo=new ManagerQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Manager> paginate = managerService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}