package pers.sjh.cloud_note.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.cloud_note.domain.system.Menu;
import pers.sjh.cloud_note.domain.common.tree.MenuTree;
import pers.sjh.cloud_note.mapper.system.MenuMapper;
import pers.sjh.cloud_note.service.system.MenuService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 13:58
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<MenuTree> findMenuList() {
        List<Menu> menuList = menuMapper.findAll();
        List<MenuTree> menuTree = recursionMenuList(menuList,"root");
        return menuTree;
    }

    private List<MenuTree> recursionMenuList(List<Menu> menuList,String parentId){
        List<MenuTree> treeList = new ArrayList<>();
        for(Menu menu : menuList){
              if(menu.getParent().equals(parentId)){
                  MenuTree menuTrees = new MenuTree();
                  menuTrees.setTitle(menu.getText());
                  menuTrees.setIcon(menu.getIconCls());
                  menuTrees.setHref(menu.getRouteId());
                  menuTrees.setTarget("_self");
                  List<MenuTree> trees = recursionMenuList(menuList,menu.getMenuNo());
                  if(trees.size() != 0){
                      menuTrees.setChild(trees);
                  }
                  treeList.add(menuTrees);
              }
        }
        return treeList;
    }

}
