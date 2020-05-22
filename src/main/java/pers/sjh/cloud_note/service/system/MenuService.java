package pers.sjh.cloud_note.service.system;

import pers.sjh.cloud_note.domain.common.tree.MenuTree;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 13:58
 */
public interface MenuService {

    public List<MenuTree> findMenuList();
}
