package com.xbd.svc.user.exception;

import com.xbd.svc.common.exception.RemoteServiceException;
import com.xbd.svc.user.enums.ServiceExceptionEnum;

public class UserServiceException extends RemoteServiceException {

	private UserServiceException(Integer code, String message) {
		super(code, message);
	}

	public UserServiceException(ServiceExceptionEnum serviceExceptionEnum) {
		super(serviceExceptionEnum.getCode(), serviceExceptionEnum.getMessage());
	}

}
