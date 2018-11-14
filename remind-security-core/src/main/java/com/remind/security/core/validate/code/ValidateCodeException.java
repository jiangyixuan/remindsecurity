package com.remind.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author jiangyixuan
 * @date 2018-05-23
 */
public class ValidateCodeException extends AuthenticationException {


    public ValidateCodeException(String msg) {
        super(msg);
    }

}
