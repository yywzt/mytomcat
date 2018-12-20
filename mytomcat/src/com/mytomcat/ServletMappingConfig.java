package com.mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/19 10:30
 * @desc
 */
public class ServletMappingConfig {

    private static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    public static List<ServletMapping> getServletMappingList() {
        return servletMappingList;
    }

    public static void setServletMappingList(List<ServletMapping> servletMappingList) {
        ServletMappingConfig.servletMappingList = servletMappingList;
    }
}
