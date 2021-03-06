package com.basic.domain.base;

import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLogininfo<T extends BaseLogininfo> extends SuperModel<T> implements IBean {

	public T setId(java.lang.Long id) {
		set("id", id);
		return (T)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public T setUsername(java.lang.String username) {
		set("username", username);
		return (T)this;
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public T setPassword(java.lang.String password) {
		set("password", password);
		return (T)this;
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public T setUsertype(java.lang.Integer usertype) {
		set("usertype", usertype);
		return (T)this;
	}
	
	public java.lang.Integer getUsertype() {
		return getInt("usertype");
	}

}
