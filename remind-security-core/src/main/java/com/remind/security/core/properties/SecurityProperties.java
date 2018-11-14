package com.remind.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangyixuan
 * @date 2018-05-17
 */
//读取配置类所有以prefix名的配置项
@ConfigurationProperties(prefix = "remind.security")
public class SecurityProperties {

    private BrowserProperties browserProperties = new BrowserProperties();
    private SocialProperties social = new SocialProperties();
    private OAuth2Properties oauth2 = new OAuth2Properties();

    public BrowserProperties getBrowserProperties() {
        return browserProperties;
    }

    public void setBrowserProperties(BrowserProperties browserProperties) {
        this.browserProperties = browserProperties;
    }

    public SocialProperties getSocial() {
        return social;
    }

    public void setSocial(SocialProperties social) {
        this.social = social;
    }

    public OAuth2Properties getOauth2() {
        return oauth2;
    }

    public void setOauth2(OAuth2Properties oauth2) {
        this.oauth2 = oauth2;
    }
}
