package pers.sjh.cloud_note.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.cloud_note.domain.common.tree.MenuTree;
import pers.sjh.cloud_note.service.system.MenuService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 15:49
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/search")
    @ResponseBody
    public List<MenuTree> getMenuTree(){
        List<MenuTree> menuTree = menuService.findMenuList();
        return menuTree;
    }
}
