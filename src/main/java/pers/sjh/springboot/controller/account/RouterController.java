package pers.sjh.springboot.controller.account;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SunJinHang
 * @date 2020-05-22 10:41
 */
@Controller
public class RouterController {

    @RequestMapping(path = {"/route/{name}/{id}"})
    public String getRoute(@PathVariable("name") String name, @PathVariable("id") String id, Authentication authentication, Model model){
        String username = authentication.getName();
        model.addAttribute("username",username);
        String route = "page/" + name + "/" + id;
        return route;
    }
}
