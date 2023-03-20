package com.kelei.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class Wallet {

//    用户Id
    private Long userId;
//    钱包余额
    private Float balance;



}
