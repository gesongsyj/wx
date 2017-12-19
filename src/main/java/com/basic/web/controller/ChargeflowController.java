package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Chargeflow;
import com.basic.query.ChargeflowQueryObject;
import com.basic.service.ChargeflowService;

public class ChargeflowController extends Controller{
	ChargeflowService chargeflowService=new ChargeflowService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Chargeflow().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		ChargeflowQueryObject qo=new ChargeflowQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Chargeflow> paginate = chargeflowService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}