package pers.sjh.springboot.service.general.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.condition.general.LoginLogSearchCondition;
import pers.sjh.springboot.domain.common.Result;
import pers.sjh.springboot.domain.general.LoginLog;
import pers.sjh.springboot.mapper.general.LoginLogMapper;
import pers.sjh.springboot.service.general.LoginLogService;

import java.util.Date;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-06-01 17:24
 */
@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogMapper loginLogMapper;

    @Override
    public Result<LoginLog> searchList(LoginLogSearchCondition loginLogSearchCondition) {
        Result<LoginLog> result = new Result<>();
        try {
            List<LoginLog> list = loginLogMapper.searchList(loginLogSearchCondition);
            int count = loginLogMapper.searchCount(loginLogSearchCondition);
            result.setCode(0);
            result.setData(list);
            result.setCount(count);
        }
        catch (Exception ex){
            result.setCode(500);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @Override
    public void createLog(LoginLog loginLog) {
        loginLog.setLoginTime(new Date());
        loginLogMapper.create(loginLog);
    }
}
