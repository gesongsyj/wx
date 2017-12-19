package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Manager;
import com.basic.query.ManagerQueryObject;

public class ManagerService{

	public Page<Manager> paginate(ManagerQueryObject qo) {
		return Manager.dao.paginate(qo);
	}

}