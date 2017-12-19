package com.javen.common;

import com.basic.web.controller.AccountController;
import com.basic.web.controller.BorrowflowController;
import com.basic.web.controller.ChargeflowController;
import com.basic.web.controller.LogininfoController;
import com.basic.web.controller.ManagerController;
import com.basic.web.controller.MeatController;
import com.basic.web.controller.SystemaccountController;
import com.javen.controller.AjaxController;
import com.javen.controller.AjaxFileContorlller;
import com.javen.controller.AllPayController;
import com.javen.controller.ConstellationController;
import com.javen.controller.FileController;
import com.javen.controller.IndexController;
import com.javen.controller.JSSDKController;
import com.javen.controller.SubscribeMsgController;
import com.javen.controller.TUserController;
import com.javen.weixin.controller.RedPackApiController;
import com.javen.weixin.controller.WeiXinOauthController;
import com.javen.weixin.controller.WeixinApiController;
import com.javen.weixin.controller.WeixinMsgController;
import com.javen.weixin.controller.WeixinPayController;
import com.javen.weixin.controller.WeixinTransfersController;
import com.javen.weixin.user.UserController;
import com.jfinal.config.Routes;
import com.jfinal.template.ext.spring.JFinalViewResolver;
import com.paysapi.controller.PayController;

public class StoreRoutes extends Routes {

	@Override
	public void config() {
		//数据库对象
		add("/account", AccountController.class);
		add("/borrowflow", BorrowflowController.class);
		add("/chargeflow", ChargeflowController.class);
		add("/logininfo", LogininfoController.class);
		add("/manager", ManagerController.class);
		add("/meat", MeatController.class);
		add("/systemaccount", SystemaccountController.class);

	}

}
