package com.remind.security.core.properties;

/**
 * @author jiangyixuan
 * @date 2018-05-23
 */
public class BrowserProperties {

    private String signUpUrl = "/remind-signIn.html";

    private LoginType loginType = LoginType.JSON;

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public String getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(String signUpUrl) {
        this.signUpUrl = signUpUrl;
    }
}
