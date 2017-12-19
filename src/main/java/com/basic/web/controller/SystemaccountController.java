package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Systemaccount;
import com.basic.query.SystemaccountQueryObject;
import com.basic.service.SystemaccountService;

public class SystemaccountController extends Controller{
	SystemaccountService systemaccountService=new SystemaccountService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Systemaccount().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		SystemaccountQueryObject qo=new SystemaccountQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Systemaccount> paginate = systemaccountService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}