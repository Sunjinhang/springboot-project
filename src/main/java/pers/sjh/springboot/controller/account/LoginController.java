package pers.sjh.springboot.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.condition.general.LoginLogSearchCondition;
import pers.sjh.springboot.domain.common.ConvertToCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.general.LoginLog;
import pers.sjh.springboot.service.general.LoginLogService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {



    @RequestMapping("/login")
    public String login(){
        return "page/account/login";
    }


}
