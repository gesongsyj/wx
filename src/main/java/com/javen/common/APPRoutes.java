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

public class APPRoutes extends Routes {

	@Override
	public void config() {
		// 微信
		add("/msg", WeixinMsgController.class);
		add("/api", WeixinApiController.class);
		add("/oauth", WeiXinOauthController.class);
		add("/jssdk", JSSDKController.class, "/view");
		// 可以去掉 /front
		add("/pay", WeixinPayController.class, "/view");
		add("/", IndexController.class, "/front");
		add("/tuser", TUserController.class, "/back");

		add("/ajax", AjaxController.class);
		add("/constellation", ConstellationController.class, "/front");
		add("/wxuser", UserController.class, "/front");
		add("/file", FileController.class, "/front");
		add("/ajaxfile", AjaxFileContorlller.class, "/front");

		add("/read", RedPackApiController.class);
		add("/transfers", WeixinTransfersController.class);
		add("/allpay", AllPayController.class);
		add("/subscribemsg", SubscribeMsgController.class);

	}

}
