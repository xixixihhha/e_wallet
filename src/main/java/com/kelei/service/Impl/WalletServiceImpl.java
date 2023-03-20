package com.kelei.service.Impl;


import com.kelei.entity.Wallet;
import com.kelei.mapper.WalletMapper;
import com.kelei.service.WalletService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Resource
    public WalletMapper walletMapper;



    @Override
    public List<Wallet> findAllUser() {
        return walletMapper.findAllUser();
    }

    @Override
    public Long findBalance(long userId) {
        return walletMapper.findBalance(userId);
    }

//    @Override
//    public boolean updateBalanceConsume100(long userId) {
//        return walletMapper.updateBalanceConsume100(userId);
//    }
//
//    @Override
//    public boolean updateBalanceAdd20(long userId) {
//        return walletMapper.updateBalanceAdd20(userId);
//    }
}
