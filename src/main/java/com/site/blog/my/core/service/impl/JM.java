package com.site.blog.my.core.service.impl;

import com.site.blog.my.core.util.MD5Util;

/**
 * @author: 公杰
 * @Project: JavaLaity
 */

//生成md5加密数据
public class JM {
    //单独创建的
    public static void main(String[] args) {
        String pwd = "";
        String gongjie123 = MD5Util.MD5Encode("gongjie123", pwd);
        System.out.println(gongjie123);
        if (gongjie123.equals("20e5e401c75c3470ff30da7662573156")) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }
}
