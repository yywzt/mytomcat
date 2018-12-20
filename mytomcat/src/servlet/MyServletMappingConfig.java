package servlet;

import com.mytomcat.ServletMapping;
import com.mytomcat.ServletMappingConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/19 10:47
 * @desc
 */
public class MyServletMappingConfig {

    private static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static{
        servletMappingList.add(new ServletMapping("hello","/hello","servlet.HelloServlet"));
    }

    public void init(){
        ServletMappingConfig.setServletMappingList(servletMappingList);
    }
}
