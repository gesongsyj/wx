package com.basic.domain;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.basic.domain.base.BaseSystemaccount;
import com.basic.query.SystemaccountQueryObject;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Systemaccount extends BaseSystemaccount<Systemaccount> {
	public static final Systemaccount dao = new Systemaccount().dao();
	public Page<Systemaccount> paginate(SystemaccountQueryObject qo) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("qo", qo));
		return dao.paginate(qo.getCurrentPage(), qo.getPageSize(), sqlPara);
	}
}