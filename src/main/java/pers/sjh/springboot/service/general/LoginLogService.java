package pers.sjh.springboot.service.general;

import pers.sjh.springboot.condition.general.LoginLogSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.general.LoginLog;

/**
 * @author SunJinHang
 * @date 2020-06-01 17:19
 */
public interface LoginLogService {

    Result<LoginLog> searchList(LoginLogSearchCondition loginLogSearchCondition);

    void createLog(LoginLog loginLog);
}
