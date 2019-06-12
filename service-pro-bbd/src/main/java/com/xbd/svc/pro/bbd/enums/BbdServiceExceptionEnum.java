package com.xbd.svc.pro.bbd.enums;

import lombok.Getter;

@Getter
public enum BbdServiceExceptionEnum {

	/**
	 * 路由到其他服务时，服务出错或者未启动抛出的异常信息
	 */
	ROUTER_ERROR(9000, "系统繁忙中,请稍后再试");

	private Integer code;

	private String message;

	BbdServiceExceptionEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
}
