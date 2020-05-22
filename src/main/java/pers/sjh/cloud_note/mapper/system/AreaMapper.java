package pers.sjh.cloud_note.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.cloud_note.domain.system.Area;
import pers.sjh.cloud_note.mapper.BaseMapper;

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
