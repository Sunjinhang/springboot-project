package pers.sjh.springboot.domain.common;

/**
 * @author SunJinHang
 * @date 2020-05-28 13:40
 */
public class UUID {
    public  static String randomString(){
        String uuid = java.util.UUID.randomUUID().toString().replace("-","");
        return  uuid;
    }
}
