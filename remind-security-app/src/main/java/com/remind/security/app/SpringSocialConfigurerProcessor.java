package com.remind.security.app;

import com.remind.security.core.social.RemindSpringSocialConfigurer;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author jiangyixuan
 * @date 2018-06-11
 */
@Component
public class SpringSocialConfigurerProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        if (StringUtils.equals(s, "remindSocialSecurityConfig")) {
            RemindSpringSocialConfigurer configurer = (RemindSpringSocialConfigurer) o;
            configurer.signupUrl("/social/signUp");
            return configurer;
        }
        return o;
    }
}
