package com.xbd.svc.user.enums;

import lombok.Getter;

@Getter
public enum ServiceExceptionEnum {
	
	ERROR_PARAM(200001, "参数错误")
	;
	
	private Integer code;
	
	private String message;

	private ServiceExceptionEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}
