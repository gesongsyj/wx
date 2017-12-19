package com.javen.common;

import com.basic.domain.Account;
import com.basic.domain.Borrowflow;
import com.basic.domain.Chargeflow;
import com.basic.domain.Logininfo;
import com.basic.domain.Manager;
import com.basic.domain.Meat;
import com.basic.domain.Systemaccount;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

public class _MappingKit {
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("account", "id", Account.class);
		arp.addMapping("borrowflow", "id", Borrowflow.class);
		arp.addMapping("chargeflow", "id", Chargeflow.class);
		arp.addMapping("logininfo", "id", Logininfo.class);
		arp.addMapping("manager", "id", Manager.class);
		arp.addMapping("meat", "id", Meat.class);
		arp.addMapping("systemaccount", "id", Systemaccount.class);
	}
}
