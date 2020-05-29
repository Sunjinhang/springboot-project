package pers.sjh.springboot.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.system.Department;
import pers.sjh.springboot.mapper.BaseMapper;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-27 17:47
 */
@Mapper
@Repository
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> findByParentId(String parentId);
}
