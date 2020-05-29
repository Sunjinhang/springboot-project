package pers.sjh.springboot.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.domain.common.tree.DepartmentTree;
import pers.sjh.springboot.service.system.DepartmentService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-27 17:58
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/search")
    @ResponseBody
    public List<DepartmentTree> getDepartmentTree(String id){
        List<DepartmentTree> treeList = departmentService.getDepartmentTree(id);
        return treeList;
    }

}
