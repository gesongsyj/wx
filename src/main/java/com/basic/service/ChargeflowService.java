package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Chargeflow;
import com.basic.query.ChargeflowQueryObject;

public class ChargeflowService{

	public Page<Chargeflow> paginate(ChargeflowQueryObject qo) {
		return Chargeflow.dao.paginate(qo);
	}

}