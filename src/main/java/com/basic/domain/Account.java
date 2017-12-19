package com.basic.domain;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.basic.domain.base.BaseAccount;
import com.basic.query.AccountQueryObject;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Account extends BaseAccount<Account> {
	public static final Account dao = new Account().dao();
	public Page<Account> paginate(AccountQueryObject qo) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("qo", qo));
		return dao.paginate(qo.getCurrentPage(), qo.getPageSize(), sqlPara);
	}
}