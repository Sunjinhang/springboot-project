package pers.sjh.cloud_note.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.cloud_note.condition.system.UserSearchCondition;
import pers.sjh.cloud_note.domain.common.ConvertToCondition;
import pers.sjh.cloud_note.domain.system.User;
import pers.sjh.cloud_note.domain.common.Result;
import pers.sjh.cloud_note.service.system.UserService;

import javax.servlet.http.HttpServletRequest;


/**
 * @author SunJinHang
 * @date 2020-05-21 19:53
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/search")
    @ResponseBody
    public Result<User> getUserData(HttpServletRequest httpServletRequest) throws Exception {
        UserSearchCondition condition = ConvertToCondition.execute(httpServletRequest,UserSearchCondition.class);
        Result<User> result = userService.searchList(condition);
        return result;
    }
}
