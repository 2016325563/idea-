package cn.kgc.user.service.impl;

import cn.kgc.user.entity.User;
import cn.kgc.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @param
 * @author qwerty
 * @date 2023/9/2
 */

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("账户不存在");


        }

        return user;


    }
}
