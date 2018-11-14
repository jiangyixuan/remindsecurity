package com.remind.security.browser.support;

/**
 * @author jiangyixuan
 * @date 2018-05-17
 */
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
