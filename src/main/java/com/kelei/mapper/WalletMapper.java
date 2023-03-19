package com.kelei.mapper;

import com.kelei.entity.Record;
import com.kelei.entity.Wallet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface WalletMapper {
//    查询所有用户
    List<Wallet> findAllUser();

//    1.  查询用户钱包余额
    Long findBalance(@Param("userId")long userId);

//    2.修改用户余额，消费100接口
    boolean updateBalanceConsume100(@Param("userId")long userId);

//    退款20接口
    boolean updateBalanceAdd20(@Param("userId")long userId);
}
