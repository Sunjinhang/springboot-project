package pers.sjh.springboot.service.system;

import pers.sjh.springboot.condition.system.RoleSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.system.Role;
import pers.sjh.springboot.service.BaseService;

/**
 * @author SunJinHang
 * @date 2020-06-05 09:51
 */
public interface RoleService extends BaseService<Role> {

    Result<Role> searchList(RoleSearchCondition condition);
}
