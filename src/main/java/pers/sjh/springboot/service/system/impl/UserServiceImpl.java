package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.condition.system.UserSearchCondition;
import pers.sjh.springboot.domain.common.UUID;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.mapper.system.UserMapper;
import pers.sjh.springboot.service.system.UserService;

import java.util.Date;
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
    public Result<User> searchList(UserSearchCondition userSearchCondition) {
        Result<User> result = new Result<>();
        List<User> list = userMapper.searchList(userSearchCondition);
        int count = userMapper.searchCount(userSearchCondition);
        result.setCode(0);
        result.setCount(count);
        result.setData(list);
        return result;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @Override
    public Result<Object> create(User user) {
        Result<Object> result = new Result<>();
        try{
            user.setDeleted(false);
            userMapper.create(user);
            result.setCode(200);
            result.setMsg("新增用户成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> update(User source) {
        Result<Object> result = new Result<>();
        try{
            User user = userMapper.findById(source.getId());
            user.setLoginName(source.getLoginName());
            user.setPassword(source.getPassword());
            user.setRealName(source.getRealName());
            user.setLastAccess(new Date());
            user.setEmail(source.getEmail());
            user.setAuthorities(source.getAuthorities());
            user.setDepartmentId(source.getDepartmentId());
            user.setFailedLogins(source.getFailedLogins());
            user.setRoles(source.getRoles());
            userMapper.update(user);
            result.setCode(200);
            result.setMsg("更新用户成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }

        return result;
    }

    @Override
    public Result<Object> delete(User user) {
        Result<Object> result = new Result<>();
        try{
            userMapper.delete(user);
            result.setCode(200);
            result.setMsg("删除用户成功");
        }
        catch (Exception ex){
           result.setCode(500);
           result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public User findById(String id) {
        User user = userMapper.findById(id);
        return user;
    }
}
