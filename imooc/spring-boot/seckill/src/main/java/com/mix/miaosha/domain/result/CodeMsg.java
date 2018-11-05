package com.mix.miaosha.domain.result;

import com.mix.miaosha.domain.Base;

public class CodeMsg extends Base {
	private int code;
	private String msg;
	
	//通用异常
	public static CodeMsg SESSION_ERROR = new CodeMsg(1, "session_error");
	public static CodeMsg SUCCESS = new CodeMsg(0, "success");
	public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
	public static CodeMsg EMPTY = new CodeMsg(500211, "登录密码不能为空");
	public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg(500212, "手机号不存在");
	public static CodeMsg PASSWORD_ERROR = new CodeMsg(500213, "密码错误");
	public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常： %s");
	public static CodeMsg TOKEN_USER_NOT_EXIST = new CodeMsg(500102, "token user不存在");

	//登录模块 5002XX
	
	//商品模块 5003XX
	
	//订单模块 5004XX
	public static CodeMsg ORDER_NOT_EXIST = new CodeMsg(500400, "订单不存在");

	//秒杀模块 5005XX
	public static CodeMsg MIAO_SHA_OVER = new CodeMsg(500500, "商品已秒杀完毕");
	public static CodeMsg REPEAT_MIAO_SHA = new CodeMsg(500501, "不能重复秒杀");
	public static CodeMsg MIAO_SHA_FAIL = new CodeMsg(500500, "商品秒杀失败");

	private CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public CodeMsg fillArgs(Object... args) {
		int code = this.code;
		String message = String.format(this.msg, args);
		return new CodeMsg(code, message);
	}
	
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
}
