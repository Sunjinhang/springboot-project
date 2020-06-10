package pers.sjh.springboot.service.system;

import pers.sjh.springboot.condition.system.DepartmentSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.tree.DepartmentTree;
import pers.sjh.springboot.domain.system.Department;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.service.BaseService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-27 17:43
 */
public interface DepartmentService extends BaseService<Department> {


    List<DepartmentTree> getDepartmentTree(String id);


    Result<Department> searchList(DepartmentSearchCondition departmentSearchCondition);

}
