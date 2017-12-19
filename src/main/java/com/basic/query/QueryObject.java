package com.basic.query;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class QueryObject {
	private Integer currentPage = 1;
	private Integer pageSize = 5;

	protected boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}

	// 返回分页的起点
	public Integer getStart() {
		return (currentPage - 1) * pageSize;
	}
}