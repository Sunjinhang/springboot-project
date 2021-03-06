package pers.sjh.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pers.sjh.springboot.mapper.system.UserMapper;


@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        pers.sjh.springboot.domain.system.User user  = userMapper.findByName(username);
        UserDetails userDetails = null;
        if(user != null){
            userDetails = new User(username,user.getPassword(),true,true,true,true,AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_USER"));
            return userDetails;
        }
        return null;
    }


}
