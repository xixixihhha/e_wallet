package com.kelei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kelei.entity.Wallet;
import com.kelei.mapper.WalletMapper;
import com.kelei.service.WalletService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/wallet")
public class WalletController {


    @Resource
    public WalletService walletService;

    @GetMapping
    public List<Wallet> findAll(){
//        logger.debug("dd");
        return walletService.findAllUser();
    }

    @GetMapping("/find/{userId}")
    public Long findBalance(@PathVariable("userId") long userId){
        return walletService.findBalance(userId);
    }

}
