package pers.sjh.cloud_note.mapper.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pers.sjh.cloud_note.domain.system.Menu;
import pers.sjh.cloud_note.mapper.BaseMapper;

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
