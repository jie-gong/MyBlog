package com.site.blog.my.core.service.impl;

import com.site.blog.my.core.util.MD5Util;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.site.blog.my.core.service.impl.JM
 * @Date: 2022年09月25日 21:20
 * @Description:
 */

//生成md5加密数据
public class JM {
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
