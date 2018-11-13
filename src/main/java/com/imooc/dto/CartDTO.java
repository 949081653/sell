package com.imooc.dto;

import lombok.Data;

/** 
* @Description: 购物车 
* @Author: Mr.Liu
* @Date: 2018/11/10 
*/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
