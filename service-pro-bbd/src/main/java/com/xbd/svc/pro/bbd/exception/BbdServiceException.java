package com.xbd.svc.pro.bbd.exception;

import com.xbd.svc.common.exception.BaseServiceException;

public class BbdServiceException extends BaseServiceException {


    public BbdServiceException(Integer code, String message) {
        super(code, message);
    }
}
