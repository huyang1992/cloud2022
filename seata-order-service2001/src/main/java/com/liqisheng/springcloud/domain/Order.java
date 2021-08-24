package com.liqisheng.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;

    //用户Id
    private Long userId;

    //产品Id
    private Long productId;

    //数量
    private Integer count;
    //金额
    private BigDecimal money;
    //0在说明正在创建中，没有创建好，1是表示这个已经创建好。跟0的区别是，这个下单之后会触发，减库存，扣钱这个步骤。
    private Integer status; //订单状态：0：创建中；1：已完结
}
