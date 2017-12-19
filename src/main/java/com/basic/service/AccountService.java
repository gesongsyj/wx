package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Account;
import com.basic.query.AccountQueryObject;

public class AccountService{

	public Page<Account> paginate(AccountQueryObject qo) {
		return Account.dao.paginate(qo);
	}

}