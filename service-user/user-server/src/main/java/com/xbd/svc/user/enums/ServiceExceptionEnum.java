package com.xbd.svc.user.enums;

import lombok.Getter;

@Getter
public enum ServiceExceptionEnum {
	
	ERROR_PARAM(200001, "参数错误"),
	ERROR_Ex(200001, "异常报错啦,,,,,")
	;
	
	private Integer code;
	
	private String message;

	private ServiceExceptionEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}
