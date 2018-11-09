package com.imooc.VO;

import lombok.Data;

/**
 * @program: sell
 * @description: http请求返回最外层对象
 * @author: Mr.Liu
 * @create: 2018-11-09 16:12
 **/
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;
}
