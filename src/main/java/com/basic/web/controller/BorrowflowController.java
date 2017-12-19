package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Borrowflow;
import com.basic.query.BorrowflowQueryObject;
import com.basic.service.BorrowflowService;

public class BorrowflowController extends Controller{
	BorrowflowService borrowflowService=new BorrowflowService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Borrowflow().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		BorrowflowQueryObject qo=new BorrowflowQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Borrowflow> paginate = borrowflowService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}