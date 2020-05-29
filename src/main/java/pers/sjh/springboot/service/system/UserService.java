package pers.sjh.springboot.service.system;

import pers.sjh.springboot.condition.system.UserSearchCondition;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.domain.common.Result;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:53
 */
public interface UserService {


    Result<User> searchList(UserSearchCondition userSearchCondition);


    List<User> findAll();

    Result<Object> addUser(User user);

    Result<Object> updateUser(User user);

    void deleteUser(String id);


}
