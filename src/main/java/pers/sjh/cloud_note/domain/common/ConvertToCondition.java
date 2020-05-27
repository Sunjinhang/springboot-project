package pers.sjh.cloud_note.domain.common;

import org.springframework.beans.BeanUtils;
import pers.sjh.cloud_note.condition.BaseCondition;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Enumeration;
import java.util.Objects;

/**
 * @author SunJinHang
 * @date 2020-05-27 13:20
 */
public class ConvertToCondition {

    public static <T extends BaseCondition> T execute(HttpServletRequest request, Class<T> tClass) throws Exception {
        T condition = tClass.newInstance();
        Enumeration enumeration = request.getParameterNames();
        while(enumeration.hasMoreElements()){
            String fieldName = (String)enumeration.nextElement();
            Object fieldValue = request.getParameter(fieldName);
            setPropertyValue(condition,fieldName,fieldValue);
        }
        int start = (condition.getPage() - 1) *  condition.getLimit();
        condition.setStart(start);
        return condition;
    }

    private static <T extends BaseCondition>  void setPropertyValue(T condition,String fieldName,Object fieldValue) throws InvocationTargetException, IllegalAccessException {
        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(condition.getClass());
        for (PropertyDescriptor pd : pds) {
            if (Objects.equals(pd.getName(), fieldName)) {
                Method writeMethod = pd.getWriteMethod();
                if (writeMethod != null) {
                    if(pd.getPropertyType() == String.class){
                        writeMethod.invoke(condition, String.valueOf(fieldValue));
                    }
                    else if(pd.getPropertyType() == Integer.class){
                        writeMethod.invoke(condition, Integer.parseInt(String.valueOf(fieldValue)));
                    }
                    else if(pd.getPropertyType() == Boolean.class){
                        writeMethod.invoke(condition, Boolean.parseBoolean(String.valueOf(fieldValue)));
                    }
                    else if(pd.getPropertyType() == Double.class){
                        writeMethod.invoke(condition, Double.parseDouble(String.valueOf(fieldValue)));
                    }
                    else if(pd.getPropertyType() == Float.class){
                        writeMethod.invoke(condition,Float.parseFloat(String.valueOf(fieldValue)));
                    }
                    else if(pd.getPropertyType() == Long.class){
                        writeMethod.invoke(condition, Long.parseLong(String.valueOf(fieldValue)));
                    }
                    else if(pd.getPropertyType() == Date.class){
                        writeMethod.invoke(condition, Date.parse(String.valueOf(fieldValue)));
                    }
                    else
                    {
                        writeMethod.invoke(condition, fieldValue);
                    }
                }
            }

        }
    }


}
