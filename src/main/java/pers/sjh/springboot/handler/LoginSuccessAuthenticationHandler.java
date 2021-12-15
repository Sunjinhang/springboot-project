package pers.sjh.springboot.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import pers.sjh.springboot.domain.general.LoginLog;
import pers.sjh.springboot.mapper.general.LoginLogMapper;
import pers.sjh.springboot.utils.IPUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@Component
public class LoginSuccessAuthenticationHandler implements AuthenticationSuccessHandler {

    protected Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private LoginLogMapper loginLogMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        LoginLog loginLog = new LoginLog();
        loginLog.setUserName(authentication.getName());
        loginLog.setLoginTime(new Date());
        String ip = IPUtil.getClientIpAddress(httpServletRequest);
        loginLog.setIp(ip);
        String location = IPUtil.getCityInfo(ip);
        loginLog.setLocation(location);
        loginLog.setSystemBrowserInfo(httpServletRequest);
        loginLogMapper.create(loginLog);
        httpServletResponse.sendRedirect("/");
    }
}
