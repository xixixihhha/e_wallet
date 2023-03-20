package com.kelei.service.Impl;


import com.kelei.entity.Record;
import com.kelei.mapper.RecordMapper;
import com.kelei.mapper.WalletMapper;
import com.kelei.service.RecordService;
import com.kelei.utils.BusinessException;
import com.kelei.utils.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    public RecordMapper recordMapper;
    @Resource
    public WalletMapper walletMapper;

/**
 * @Description 查找所有交易记录
 * */
    @Override
    public List<Record> findByUserId(long userId) {
        return recordMapper.findByUserId(userId);
    }


    /**
     * @Description 用户消费100块
     * */
    @Override
    public void insertByIdConsume100(long userId) throws Exception{
        Long balance = walletMapper.findBalance(userId);
//        用户余额不足100元，返回报错，无法购买
        if(balance<100){
            throw new BusinessException("余额不足以购买");
        }
        String date = DateUtil.getDateTime();
//        新增交易记录
        recordMapper.insertByConsume100(userId,date);
//        更新用户钱包余额
        walletMapper.updateBalanceConsume100(userId);

    }

    /**
     * @Description 用户退款20块
     * */
    @Override
    public void insertByIdAdd20(long userId) {
        String date = DateUtil.getDateTime();
//        新增交易记录
        recordMapper.insertByRefund20(userId,date);
//        更新用户钱包余额
        walletMapper.updateBalanceAdd20(userId);
    }
}
