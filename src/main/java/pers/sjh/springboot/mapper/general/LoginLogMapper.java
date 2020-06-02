package pers.sjh.springboot.mapper.general;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.general.LoginLog;
import pers.sjh.springboot.mapper.BaseMapper;

/**
 * @author SunJinHang
 * @date 2020-06-01 17:25
 */
@Mapper
@Repository
public interface LoginLogMapper extends BaseMapper<LoginLog> {

}
