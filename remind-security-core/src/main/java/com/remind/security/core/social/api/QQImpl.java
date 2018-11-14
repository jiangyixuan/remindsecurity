package com.remind.security.core.social.api;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;

/**
 * @author jiangyixuan
 * @date 2018-06-08
 */
public class QQImpl extends AbstractOAuth2ApiBinding implements QQ {

    private String appId;
    private String openId;

    public QQImpl(String accessToken, String appId) {
        super(accessToken, TokenStrategy.ACCESS_TOKEN_PARAMETER);
        this.appId = appId;
        this.openId = "";
    }

    @Override
    public QQUserInfo getUserInfo() {
        return null;
    }

}
