package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Systemaccount;
import com.basic.query.SystemaccountQueryObject;

public class SystemaccountService{

	public Page<Systemaccount> paginate(SystemaccountQueryObject qo) {
		return Systemaccount.dao.paginate(qo);
	}

}