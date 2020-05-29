package pers.sjh.springboot.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.condition.system.UserSearchCondition;
import pers.sjh.springboot.domain.common.ConvertToCondition;
import pers.sjh.springboot.domain.common.UUID;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.service.system.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @author SunJinHang
 * @date 2020-05-21 19:53
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping("/search")
    @ResponseBody
    public Result<User> getUserData(HttpServletRequest httpServletRequest) throws Exception {
        UserSearchCondition condition = ConvertToCondition.execute(httpServletRequest,UserSearchCondition.class);
        Result<User> result = userService.searchList(condition);
        return result;
    }

    @RequestMapping("/create")
    @ResponseBody
    public Result<Object> create(Authentication authentication, @RequestBody User user){
        user.setId(UUID.randomString());
        user.setLoginName(user.getRealName());
        user.setCreator(authentication.getName());
        user.setUpdater(authentication.getName());
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        Result<Object> result = userService.addUser(user);
        return result;
    }

    @RequestMapping("/deleteBatch")
    @ResponseBody
    public Result<Object> deleteBatch(@RequestBody List<User> users){
        Result<Object> result = new Result<>();
        try{
            for(User user :users){
                userService.deleteUser(user.getId());
            }
            result.setCode(200);
            result.setMsg("批量删除用户成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result<Object> delete(String id){
        Result<Object> result = new Result<>();
        try{
            userService.deleteUser(id);
            result.setCode(200);
            result.setMsg("删除用户成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }
}
