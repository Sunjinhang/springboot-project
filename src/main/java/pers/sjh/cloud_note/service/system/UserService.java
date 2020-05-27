package pers.sjh.cloud_note.service.system;

import pers.sjh.cloud_note.condition.system.UserSearchCondition;
import pers.sjh.cloud_note.domain.system.User;
import pers.sjh.cloud_note.domain.common.Result;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:53
 */
public interface UserService {


    Result<User> searchList(UserSearchCondition userSearchCondition);

}
