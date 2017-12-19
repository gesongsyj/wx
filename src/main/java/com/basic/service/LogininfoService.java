package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Logininfo;
import com.basic.query.LogininfoQueryObject;

public class LogininfoService{

	public Page<Logininfo> paginate(LogininfoQueryObject qo) {
		return Logininfo.dao.paginate(qo);
	}

}