package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Meat;
import com.basic.query.MeatQueryObject;
import com.basic.service.MeatService;

public class MeatController extends Controller{
	MeatService meatService=new MeatService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Meat().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		MeatQueryObject qo=new MeatQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Meat> paginate = meatService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}