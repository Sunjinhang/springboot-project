package pers.sjh.springboot.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.system.Area;
import pers.sjh.springboot.mapper.BaseMapper;

import java.math.BigInteger;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 13:05
 */

@Mapper
@Repository
public interface AreaMapper extends BaseMapper<Area> {

    List<Area> findByParentId(BigInteger parentId);
}
