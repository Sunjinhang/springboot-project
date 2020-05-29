package pers.sjh.springboot.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.system.User;
import pers.sjh.springboot.mapper.BaseMapper;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    User findByName(String userLogin);
}
