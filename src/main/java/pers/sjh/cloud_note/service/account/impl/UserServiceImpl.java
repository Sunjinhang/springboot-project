package pers.sjh.cloud_note.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.cloud_note.domain.account.User;
import pers.sjh.cloud_note.domain.common.Page;
import pers.sjh.cloud_note.domain.common.Result;
import pers.sjh.cloud_note.mapper.account.UserMapper;
import pers.sjh.cloud_note.service.account.UserService;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<User> createUser(User user) {
        Result<User> result = new Result<User>();
        user.setId(UUID.randomUUID().toString());
        userMapper.create(user);
        return result;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Page<User> searchList() {
        return null;
    }
}
