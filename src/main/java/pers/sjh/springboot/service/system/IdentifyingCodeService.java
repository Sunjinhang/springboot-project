package pers.sjh.springboot.service.system;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author SunJinHang
 * @date 2020-06-03 16:47
 */
public interface IdentifyingCodeService {

    void create(HttpServletResponse httpServletResponse) throws IOException;
}
