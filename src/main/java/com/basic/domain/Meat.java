package com.basic.domain;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;

import java.util.List;

import com.basic.domain.base.BaseMeat;
import com.basic.query.MeatQueryObject;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Meat extends BaseMeat<Meat> {
	public static final int STATE_ENABLED=1;
	public static final int STATE_UNABLED=0;
	
	public static final Meat dao = new Meat().dao();
	public Page<Meat> paginate(MeatQueryObject qo) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("qo", qo));
		return dao.paginate(qo.getCurrentPage(), qo.getPageSize(), sqlPara);
	}
	public List<Meat> selectAllByState(int state) {
		SqlPara sqlPara = getSqlParaFromTemplate(Kv.by("state", state));
		return dao.find(sqlPara);
	}
}
