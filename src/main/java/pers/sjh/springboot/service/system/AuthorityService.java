package pers.sjh.springboot.service.system;

import pers.sjh.springboot.condition.system.AuthoritySearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.system.Authority;
import pers.sjh.springboot.service.BaseService;

/**
 * @author SunJinHang
 * @date 2020-06-08 17:12
 */
public interface AuthorityService extends BaseService<Authority> {
    Result<Authority> search(AuthoritySearchCondition condition);
}
