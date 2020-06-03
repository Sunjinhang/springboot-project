package pers.sjh.springboot.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
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


    @RequestMapping("/login")
    public String login(){
        return "page/account/login";
    }


    @GetMapping("/generate")
    public void generateCode(HttpServletResponse httpServletResponse) throws IOException {
        identifyingCodeService.create(httpServletResponse);
    }



}
