package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.condition.system.DepartmentSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.tree.DepartmentTree;
import pers.sjh.springboot.domain.system.Department;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.mapper.system.DepartmentMapper;
import pers.sjh.springboot.service.system.DepartmentService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-27 17:44
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<DepartmentTree> getDepartmentTree(String id) {
        List<Department> departmentList = departmentMapper.findByParentId(id);
        List<DepartmentTree> departmentTrees = new ArrayList<>();
        DepartmentTree tree = null;
        for(Department department : departmentList){
            tree = new DepartmentTree();
            tree.setId(department.getId());
            tree.setLabel(department.getDeptName());
            tree.setLeaf(false);
            departmentTrees.add(tree);
        }
        return departmentTrees;
    }

    @Override
    public Result<Department> searchList(DepartmentSearchCondition departmentSearchCondition) {
        Result<Department> result = new Result<>();
        try{
            List<Department> list = departmentMapper.searchList(departmentSearchCondition);
            int count = departmentMapper.searchCount(departmentSearchCondition);
            result.setCode(0);
            result.setData(list);
            result.setCount(count);
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> create(Department department) {
        Result<Object> result = new Result<>();
        try{

        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> update (Department department) {
        Result<Object> result = new Result<>();
        try{

        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> delete(Department department) {
        Result<Object> result = new Result<>();
        try{
             departmentMapper.delete(department);
             result.setCode(200);
             result.setMsg("删除部门成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Department findById(String id) {
        Department department = departmentMapper.findById(id);
        return department;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
