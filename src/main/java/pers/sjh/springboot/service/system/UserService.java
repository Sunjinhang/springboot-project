package pers.sjh.springboot.service.system;

import pers.sjh.springboot.condition.system.UserSearchCondition;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.service.BaseService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:53
 */
public interface UserService extends BaseService<User> {

    Result<User> searchList(UserSearchCondition userSearchCondition);
}
