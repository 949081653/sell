package com.imooc.untils;

import java.util.Random;

/**
 * @program: sell
 * @description:
 * @author: Mr.Liu
 * @create: 2018-11-09 17:56
 **/
public class KeyUtil {

    /**
    * @Description: 生成唯一的主键
    * @return: java.lang.String
    * @Author: Mr.Liu
    * @Date: 2018/11/9
    */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer rand = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(rand);
    }
}
