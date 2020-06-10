package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.condition.system.RoleSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.system.Role;
import pers.sjh.springboot.mapper.system.RoleMapper;
import pers.sjh.springboot.service.system.RoleService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-06-05 10:13
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Result<Role> searchList(RoleSearchCondition condition) {
        Result<Role> result = new Result<>();
        List<Role> list = roleMapper.searchList(condition);
        int count =  roleMapper.searchCount(condition);
        result.setCode(0);
        result.setData(list);
        result.setCount(count);
        return result;
    }

    @Override
    public Result<Object> create(Role role) {
        Result<Object> result = new Result<>();
        try{
            roleMapper.create(role);
            result.setCode(200);
            result.setMsg("新增角色成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> update(Role role) {
        Result<Object> result = new Result<>();
        try{
            Role source = roleMapper.findById(role.getId());
            source.setRoleName(role.getRoleName());
            source.setAuthorities(role.getAuthorities());
            source.setMemo(role.getMemo());
            source.setUpdater(role.getUpdater());
            result.setCode(200);
            result.setMsg("角色更新成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public Result<Object> delete(Role role) {
        Result<Object> result = new Result<>();
        try{
            roleMapper.delete(role);
            result.setCode(200);
            result.setMsg("角色删除成功");
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public List<Role> findAll() {
        List<Role> result = roleMapper.findAll();
        return result;
    }

    @Override
    public Role findById(String id) {
        Role result = roleMapper.findById(id);
        return result;
    }
}
