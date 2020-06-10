package pers.sjh.springboot.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.system.Authority;
import pers.sjh.springboot.mapper.BaseMapper;

/**
 * @author SunJinHang
 * @date 2020-06-08 16:18
 */
@Mapper
@Repository
public interface AuthorityMapper extends BaseMapper<Authority> {
}
