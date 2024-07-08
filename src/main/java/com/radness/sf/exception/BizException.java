package com.radness.sf.exception;

public class BizException extends RuntimeException {

    public BizException(String msgCode) {
        super(msgCode);
    }

}