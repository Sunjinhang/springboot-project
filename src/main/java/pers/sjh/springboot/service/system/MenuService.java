package pers.sjh.springboot.service.system;

import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.common.tree.MenuTree;
import pers.sjh.springboot.domain.system.Menu;
import pers.sjh.springboot.service.BaseService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 13:58
 */
public interface MenuService extends BaseService<Menu> {
    List<MenuTree> findMenuList();

}
