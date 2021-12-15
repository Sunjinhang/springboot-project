package pers.sjh.springboot.controller.account;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.sjh.springboot.service.system.IdentifyingCodeService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    @Autowired
    private IdentifyingCodeService identifyingCodeService;


    @RequestMapping(path = {"/","/login"})
    public String login(Authentication authentication){
        if(ObjectUtil.isNull(authentication)){
            return "page/account/login";
        }
        return "page/home/index";
    }


    @GetMapping("/generate")
    public void generateCode(HttpServletResponse httpServletResponse) throws IOException {
        identifyingCodeService.create(httpServletResponse);
    }



}
