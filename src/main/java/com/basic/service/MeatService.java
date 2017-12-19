package com.basic.service;

import com.jfinal.plugin.activerecord.Page;

import java.util.List;

import com.basic.domain.Meat;
import com.basic.query.MeatQueryObject;

public class MeatService{

	public Page<Meat> paginate(MeatQueryObject qo) {
		return Meat.dao.paginate(qo);
	}
	public List<Meat> selectAllByState(int state){
		return Meat.dao.selectAllByState(state);
	}
	public Meat selectById(Long id) {
		Meat meat = Meat.dao.findById(id);
		if(meat==null){
			throw new RuntimeException("您选择的套餐不存在!");
		}
		return meat;
	}

}