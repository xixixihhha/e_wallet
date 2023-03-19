package com.kelei.entity;


import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.text.DecimalFormat;


/**
 * @Description  交易记录类
 *
 * */
@Data
public class Record {
    private Long id;
    private Long userId;
//    交易金额
    private Float amount;
//    交易类型状态码 1、消费 2、退款
    private int type;
//    消费时间
    private String date;
//    无参构造器
//    private Record(){};

}
