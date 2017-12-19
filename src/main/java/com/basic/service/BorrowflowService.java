package com.basic.service;

import com.jfinal.plugin.activerecord.Page;
import com.basic.domain.Borrowflow;
import com.basic.query.BorrowflowQueryObject;

public class BorrowflowService{

	public Page<Borrowflow> paginate(BorrowflowQueryObject qo) {
		return Borrowflow.dao.paginate(qo);
	}

}