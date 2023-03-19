package com.kelei.controller;

import com.kelei.entity.Record;
import com.kelei.entity.Wallet;
import com.kelei.mapper.RecordMapper;
import com.kelei.mapper.WalletMapper;
import com.kelei.utils.DateUtil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Resource
    public RecordMapper recordMapper;
    @Resource
    public WalletMapper walletMapper;


/**@Description 查询用户余额记录变更
 *
 * */
    @GetMapping("/find")
    public List<Record> findByUserId(long userId){
        String dateTime= DateUtil.getDateTime();
        System.out.println("该查询时间为" +dateTime);
        return recordMapper.findByUserId(userId);
    }

//    post操作
    @Transactional
    @RequestMapping(value = "/consume/{userId}")
    public String insertByIdConsume100(@PathVariable("userId")long userId){

        recordMapper.insertByConsume100(userId);
        walletMapper.updateBalanceConsume100(userId);
        return "插入成功";
    }

    //    post操作
    @Transactional
    @RequestMapping("/add/{userId}")
    public String insertByIdAdd20(@PathVariable("userId")long userId){

        recordMapper.insertByRefund20(userId);
        walletMapper.updateBalanceAdd20(userId);
        return "插入成功";
    }
}
