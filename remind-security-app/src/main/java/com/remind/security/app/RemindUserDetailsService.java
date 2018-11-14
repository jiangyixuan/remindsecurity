package com.remind.security.app;

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

        /** TODO 查询用户名和密码
         * 1.查询用户是否存在
         * 2.假如存在，查询密码
         */
        //模拟查询用户名和密码
        if (!"admin".equals(userName)) {
            throw new UsernameNotFoundException("用户不存在");
        }
        String passWord = passwordEncoder.encode("admin");

        logger.info("登录用户名：" + userName + ",数据库密码是" + passWord);
        //根据查找到的用户信息判断用户是否被冻结
        return new User(userName, passWord, true, true, true, true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_USER"));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
