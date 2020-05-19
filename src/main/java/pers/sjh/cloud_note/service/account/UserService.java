package pers.sjh.cloud_note.service.account;

import pers.sjh.cloud_note.domain.account.User;
import pers.sjh.cloud_note.domain.common.Page;
import pers.sjh.cloud_note.domain.common.Result;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:53
 */
public interface UserService {

    Result<User> createUser(User user);
    User updateUser(User user);
    void deleteUser(User user);

    List<User> findAll();

    Page<User> searchList();


}
