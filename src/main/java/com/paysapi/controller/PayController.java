package com.paysapi.controller;

import java.util.HashMap;
import java.util.Map;

import com.basic.domain.Meat;
import com.basic.service.MeatService;
import com.jfinal.core.Controller;
import com.paysapi.model.PaySaPi;
import com.paysapi.util.PayUtil;

public class PayController extends Controller{
	private MeatService meatService=new MeatService();
	/**
	 * 添加参数并跳转到index.html页面
	 */
	public void index(){
		String orderuid=getPara("orderuid");
		Long menuid=getParaToLong("menuid");
		try {
			Meat meat=meatService.selectById(menuid);
			Float price = meat.getPrice();
			
			setAttr("orderuid", orderuid);
			setAttr("price", price);
			render("index.html");
		} catch (Exception e) {
			renderText(e.getMessage());
		}
	}

	public void pay() {
		//用String接收,在需要计算或者存储的时候再转化为float,不然生成的key容易不一致
		String price=getPara("price");
		int istype=getParaToInt("istype");
		String orderuid=getPara("orderuid");
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> remoteMap = new HashMap<String, Object>();
		if(price==null || Float.parseFloat(price)<=0){
			resultMap.put("code", 0);
			resultMap.put("msg", "输入金额不能为空或小于等于0!");
		}
		remoteMap.put("price", price);
		remoteMap.put("istype", istype);
		remoteMap.put("orderid", PayUtil.getOrderIdByUUId());
		remoteMap.put("orderuid", orderuid);
		remoteMap.put("goodsname", "您自己的商品名称");
		resultMap.put("data", PayUtil.payOrder(remoteMap));
		resultMap.put("code", 1);
		System.out.println(resultMap);
		renderJson(resultMap);
	}

	public void notifyPay() {
		PaySaPi payaspi = getBean(PaySaPi.class,"");
		System.out.println("参数:"+payaspi.getKey());
		// 保证密钥一致性
		if (PayUtil.checkPayKey(payaspi)) {
			//到这里表示支付成功了
			renderText("成功");
		} else {
			renderText("失败");
			// TODO 该怎么做就怎么做
		}
	}

	public void returnPay() {
		String orderid=getPara("orderid");
		boolean isTrue = false;
		// 根据订单号查找相应的记录:根据结果跳转到不同的页面
		if (isTrue) {
			renderText("/正确的跳转地址");
		} else {
			renderText("/没有支付成功的地址");
		}
	}
}
