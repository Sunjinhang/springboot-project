package pers.sjh.cloud_note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pers.sjh.cloud_note.mapper.account.UserMapper;


@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        pers.sjh.cloud_note.domain.account.User user  = userMapper.findByName(username);
        String password = user.getPassword();
        UserDetails userDetails = null;
        if(user != null){
            userDetails = new User(username,passwordEncoder.encode(password),true,true,true,true,AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_USER"));
            return userDetails;
        }
        return null;
    }


}
