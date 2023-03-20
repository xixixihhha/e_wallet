package com.kelei.service;

import com.kelei.entity.Wallet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WalletService {

    /**
     * @Description 显示所有用户的钱包*/
    List<Wallet> findAllUser();

    /**
     * @Description 根据用户ID*/
    Long findBalance(@Param("userId")long userId);

//    boolean updateBalanceConsume100(@Param("userId")long userId);
//
//
//    boolean updateBalanceAdd20(@Param("userId")long userId);


}
