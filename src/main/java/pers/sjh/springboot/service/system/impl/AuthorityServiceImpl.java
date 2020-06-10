package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.condition.system.AuthoritySearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.system.Authority;
import pers.sjh.springboot.mapper.system.AuthorityMapper;
import pers.sjh.springboot.service.system.AuthorityService;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-06-08 17:13
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityMapper authorityMapper;


    @Override
    public Result<Authority> search(AuthoritySearchCondition condition) {
        Result<Authority> result = new Result<>();
        List<Authority> list = authorityMapper.searchList(condition);
        int count  = authorityMapper.searchCount(condition);
        result.setData(list);
        result.setCount(count);
        result.setCode(0);
        return result;
    }

    @Override
    public Result<Object> create(Authority obj) {
        return null;
    }

    @Override
    public Result<Object> update(Authority obj) {
        return null;
    }

    @Override
    public Result<Object> delete(Authority obj) {
        return null;
    }

    @Override
    public List<Authority> findAll() {
        return null;
    }

    @Override
    public Authority findById(String id) {
        return null;
    }
}
