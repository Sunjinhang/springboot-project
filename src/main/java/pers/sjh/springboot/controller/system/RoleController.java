package pers.sjh.springboot.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.condition.system.RoleSearchCondition;
import pers.sjh.springboot.domain.common.ConvertToCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.UUID;
import pers.sjh.springboot.domain.system.Role;
import pers.sjh.springboot.service.system.RoleService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SunJinHang
 * @date 2020-06-08 16:30
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    public Result<Role> search(HttpServletRequest httpServletRequest) throws Exception {
        RoleSearchCondition condition = ConvertToCondition.execute(httpServletRequest,RoleSearchCondition.class);
        Result<Role> result = roleService.searchList(condition);
        return result;
    }

    @RequestMapping("/create")
    @ResponseBody
    public Result<Object> create(@RequestBody Role role, Authentication authentication){
        role.setId(UUID.randomString());
        role.setCreator(authentication.getName());
        role.setUpdater(authentication.getName());
        Result<Object> result = roleService.create(role);
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<Object> update(@RequestBody Role role,Authentication authentication){
        role.setUpdater(authentication.getName());
        Result<Object> result = roleService.update(role);
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result<Object> delete(@RequestBody Role role,Authentication authentication){
        role.setUpdater(authentication.getName());
        Result<Object> result = roleService.delete(role);
        return result;
    }


}
