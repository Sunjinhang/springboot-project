package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.system.Menu;
import pers.sjh.springboot.domain.common.tree.MenuTree;
import pers.sjh.springboot.mapper.system.MenuMapper;
import pers.sjh.springboot.service.system.MenuService;

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

    @Override
    public Result<Object> create(Menu menu) {
        Result<Object> result = new Result<>();
        try{

        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> update(Menu menu) {
        Result<Object> result = new Result<>();
        try{
            Menu source = menuMapper.findById(menu.getMenuNo());
            source.setText(menu.getText());
            source.setRouteId(menu.getRouteId());
            source.setIconCls(menu.getIconCls());
            source.setAuthorities(menu.getAuthorities());
            source.setParent(menu.getParent());
            menuMapper.update(source);
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> delete(Menu menu) {
        Result<Object> result = new Result<>();
        try{
            menuMapper.delete(menu);
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Menu findById(String id) {
        Menu  menu = menuMapper.findById(id);
        return menu;
    }

    @Override
    public List<Menu> findAll() {
        return null;
    }
}
