package com.remind.security.core.properties;

/**
 * @author jiangyixuan
 * @date 2018-06-12
 */
public class OAuth2Properties {

    private String jwtSigningKey = "remind";

    public String getJwtSigningKey() {
        return jwtSigningKey;
    }

    public void setJwtSigningKey(String jwtSigningKey) {
        this.jwtSigningKey = jwtSigningKey;
    }

}
