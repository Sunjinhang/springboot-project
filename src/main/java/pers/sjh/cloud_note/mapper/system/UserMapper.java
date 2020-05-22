package pers.sjh.cloud_note.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.cloud_note.domain.system.User;
import pers.sjh.cloud_note.mapper.BaseMapper;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    User findByName(String userLogin);
}
