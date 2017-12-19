package com.basic.domain;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.basic.domain.base.BaseBorrowflow;
import com.basic.query.BorrowflowQueryObject;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Borrowflow extends BaseBorrowflow<Borrowflow> {
	public static final Borrowflow dao = new Borrowflow().dao();
	public Page<Borrowflow> paginate(BorrowflowQueryObject qo) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("qo", qo));
		return dao.paginate(qo.getCurrentPage(), qo.getPageSize(), sqlPara);
	}
}
