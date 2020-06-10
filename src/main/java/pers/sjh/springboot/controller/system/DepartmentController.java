package pers.sjh.springboot.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.springboot.condition.system.DepartmentSearchCondition;
import pers.sjh.springboot.domain.common.ConvertToCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.UUID;
import pers.sjh.springboot.domain.common.tree.DepartmentTree;
import pers.sjh.springboot.domain.system.Department;
import pers.sjh.springboot.service.system.DepartmentService;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/tree")
    @ResponseBody
    public List<DepartmentTree> getDepartmentTree(String id){
        List<DepartmentTree> treeList = departmentService.getDepartmentTree(id);
        return treeList;
    }

    @RequestMapping("/search")
    @ResponseBody
    public Result<Department> search(HttpServletRequest httpServletRequest) throws Exception {
        DepartmentSearchCondition condition = ConvertToCondition.execute(httpServletRequest,DepartmentSearchCondition.class);
        Result<Department> result = departmentService.searchList(condition);
        return result;
    }

    @RequestMapping("/create")
    @ResponseBody
    public  Result<Object> create(@RequestBody Department department, Authentication authentication){
        department.setId(UUID.randomString());
        department.setCreator(authentication.getName());
        department.setUpdater(authentication.getName());
        Result<Object> result = departmentService.create(department);
        return  result;
    }


    @RequestMapping("/update")
    @ResponseBody
    public  Result<Object> update(Department department, Authentication authentication){
        department.setUpdater(authentication.getName());
        Result<Object> result = departmentService.update(department);
        return  result;
    }


    @RequestMapping("/delete")
    @ResponseBody
    public  Result<Object> delete(String id, Authentication authentication){
        Department department = departmentService.findById(id);
        department.setDeleted(true);
        Result<Object> result =departmentService.delete(department);
        return  result;
    }

    @RequestMapping("/deleteBatch")
    @ResponseBody
    public  Result<Object> delbatch(@RequestBody List<Department> departments, Authentication authentication){
        Result<Object> result = new Result<>();
        try{
            for(Department department : departments){
                department.setUpdater(authentication.getName());
                department.setDeleted(true);
                departmentService.update(department);
                result.setCode(200);
                result.setMsg("批量删除部门成功");
            }
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return  result;
    }


}
