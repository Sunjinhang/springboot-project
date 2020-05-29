package pers.sjh.springboot.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.springboot.domain.system.Menu;
import pers.sjh.springboot.mapper.BaseMapper;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 13:54
 */
@Mapper
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> findRootMenu();
}
