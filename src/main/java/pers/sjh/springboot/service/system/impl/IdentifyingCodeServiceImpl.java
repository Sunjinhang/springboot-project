package pers.sjh.springboot.service.system.impl;

import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.service.system.IdentifyingCodeService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author SunJinHang
 * @date 2020-06-03 16:48
 */
@Service("identifyingCodeService")
public class IdentifyingCodeServiceImpl implements IdentifyingCodeService {

    @Override
    public void create(HttpServletResponse httpServletResponse) throws IOException {
        Captcha captcha = createCaptcha();
        httpServletResponse.setContentType(MediaType.IMAGE_PNG_VALUE);
        httpServletResponse.setHeader(HttpHeaders.PRAGMA, "No-cache");
        httpServletResponse.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
        httpServletResponse.setDateHeader(HttpHeaders.EXPIRES, 0L);
        captcha.out(httpServletResponse.getOutputStream());
    }

    private  Captcha createCaptcha(){
        Captcha captcha = new SpecCaptcha(120,39,4);
        captcha.setCharType(2);
        return captcha;
    }
}
