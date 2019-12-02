package edu.hubu.learn.util;

import org.springframework.stereotype.Component;

/**
 * @moduleName: PageConstant
 * @description: 用于规范分页查询
 *
 * @author: 吴笛老师
 */
@Component
public final class PageConstant {

    /**
     * Default size of per page
     */
    public static final String PAGE_SIZE = "20";

    /**
     * Default number indicates current page
     */
    public static final String CURRENT_PAGE = "1";

    /**
     * Default number indicates all page
     */
    public static final int ALL_PAGE = -999;

    /**
     * indicates empty string
     */
    public static final String EMPTY_STRING = "";

    /**
     * indicates server api version string
     */
    public static final String VERSION = "0.1";
}
