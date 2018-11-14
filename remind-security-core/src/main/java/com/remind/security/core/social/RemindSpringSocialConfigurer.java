package com.remind.security.core.social;

import org.springframework.social.security.SpringSocialConfigurer;

/**
 * @author jiangyixuan
 * @date 2018-06-11
 */
public class RemindSpringSocialConfigurer extends SpringSocialConfigurer {

    private String filterProcessesUrl;

    public RemindSpringSocialConfigurer(String filterProcessesUrl) {
        this.filterProcessesUrl = filterProcessesUrl;
    }

}
