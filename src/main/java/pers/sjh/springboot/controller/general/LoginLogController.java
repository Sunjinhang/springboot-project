package pers.sjh.springboot.controller.general;

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

/**
 * @author SunJinHang
 * @date 2020-06-02 16:01
 */
@Controller
@RequestMapping("/login")
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;


    @RequestMapping("/search")
    @ResponseBody
    public Result<LoginLog> search(HttpServletRequest httpServletRequest) throws Exception {
        LoginLogSearchCondition condition = ConvertToCondition.execute(httpServletRequest,LoginLogSearchCondition.class);
        Result<LoginLog> result = loginLogService.searchList(condition);
        return result;
    }
}
