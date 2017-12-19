package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Logininfo;
import com.basic.query.LogininfoQueryObject;
import com.basic.service.LogininfoService;

public class LogininfoController extends Controller{
	LogininfoService logininfoService=new LogininfoService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Logininfo().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		LogininfoQueryObject qo=new LogininfoQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Logininfo> paginate = logininfoService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}