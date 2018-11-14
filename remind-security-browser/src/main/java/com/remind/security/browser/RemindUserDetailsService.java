package com.remind.security.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author jiangyixuan
 * @date 2018-05-16
 */
@Component
public class RemindUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //模拟查询数据库加密后的密码
        String passWord = passwordEncoder.encode("123456");
        logger.info("登录用户名：" + userName + ",数据库密码是" + passWord);
        //根据用户名查找用户信息
//        return new User(userName,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        //根据查找到的用户信息判断用户是否被冻结
        return new User(userName, passWord, true, true, true, true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
