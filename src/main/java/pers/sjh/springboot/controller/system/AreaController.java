package pers.sjh.springboot.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.tree.AreaTree;
import pers.sjh.springboot.service.system.AreaService;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 13:22
 */
@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/search")
    @ResponseBody
    public List<AreaTree> getAreaTree(@RequestParam("id") BigInteger parentId){
        List<AreaTree> treeList = areaService.getAreaTree(parentId);
        return treeList;
    }

    @RequestMapping("/create")
    @ResponseBody
    public Result<Object> create(HttpServletRequest httpServletRequest, Authentication authentication){
        Result<Object> result = new Result<>();
        return  result;
    }


    @RequestMapping("/update")
    @ResponseBody
    public  Result<Object> update(HttpServletRequest httpServletRequest, Authentication authentication){
        Result<Object> result = new Result<>();
        return  result;
    }


    @RequestMapping("/delete")
    @ResponseBody
    public  Result<Object> delete(HttpServletRequest httpServletRequest, Authentication authentication){
        Result<Object> result = new Result<>();
        return  result;
    }

}
