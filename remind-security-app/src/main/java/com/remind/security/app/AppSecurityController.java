package com.remind.security.app;

import com.remind.security.app.social.AppSingUpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jiangyixuan
 * @date 2018-06-11
 */
@RestController
public class AppSecurityController {

    @Autowired
    private AppSingUpUtils appSingUpUtils;

    @GetMapping("/social/signUp")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Object getSocialUserInfo(HttpServletRequest request) {

        return "getSocialUserInfo";
    }

}
