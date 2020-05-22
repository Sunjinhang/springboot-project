package pers.sjh.cloud_note.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.cloud_note.domain.system.User;
import pers.sjh.cloud_note.domain.common.Result;
import pers.sjh.cloud_note.mapper.system.UserMapper;
import pers.sjh.cloud_note.service.system.UserService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;





    @Override
    public Result<User> searchList() {
        Result<User> result = new Result<>();
        List<User> list = userMapper.searchList();
        int count = userMapper.searchCount();
        result.setCode(0);
        result.setCount(count);
        result.setData(list);
        return result;
    }
}
