package com.basic.web.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Account;
import com.basic.query.AccountQueryObject;
import com.basic.service.AccountService;

public class AccountController extends Controller{
	AccountService accountService=new AccountService();
	
	public void testSave(){
		for (int i = 0; i <20; i++) {
			new Account().set("id",i+100).save();
		}
		renderText("添加");
	}
	public void testPage(){
		AccountQueryObject qo=new AccountQueryObject();
		//qo.setKeyword("11");
		//qo.setParentId(110L);
		Page<Account> paginate = accountService.paginate(qo);
		System.out.println(paginate.getList());
		renderText("查询");
	}
}