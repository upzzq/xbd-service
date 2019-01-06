package com.xbd.svc.user.exception;

import com.xbd.svc.common.exception.BaseServiceException;
import com.xbd.svc.user.enums.ServiceExceptionEnum;

public class ServiceException extends BaseServiceException {

	private ServiceException(Integer code, String message) {
		super(code, message);
	}

	public ServiceException(ServiceExceptionEnum serviceExceptionEnum) {
		super(serviceExceptionEnum.getCode(), serviceExceptionEnum.getMessage());
	}

}
