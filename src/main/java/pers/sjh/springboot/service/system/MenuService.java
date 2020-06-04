package pers.sjh.springboot.service.system;

import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.tree.MenuTree;
import pers.sjh.springboot.domain.system.Menu;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 13:58
 */
public interface MenuService {



    List<MenuTree> findMenuList();

    Result<Object> create(Menu menu);


    Result<Object> update(Menu menu);


    Result<Object> delete(Menu menu);

    Menu findById(String id);
}
