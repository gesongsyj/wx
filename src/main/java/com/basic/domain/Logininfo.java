package com.basic.domain;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.basic.domain.base.BaseLogininfo;
import com.basic.query.LogininfoQueryObject;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Logininfo extends BaseLogininfo<Logininfo> {
	public static final Logininfo dao = new Logininfo().dao();
	public Page<Logininfo> paginate(LogininfoQueryObject qo) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("qo", qo));
		return dao.paginate(qo.getCurrentPage(), qo.getPageSize(), sqlPara);
	}
}
