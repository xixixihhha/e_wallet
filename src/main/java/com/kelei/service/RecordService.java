package com.kelei.service;

import com.kelei.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



public interface RecordService {
/**
 * @Description 查询用户余额记录变更
* */
    List<Record> findByUserId(long userId);


/**
 * @Description 用户消费100块
 * */
    void insertByIdConsume100(long userId) throws Exception;

    /**
     * @Description 用户退款20块
     * */
    void insertByIdAdd20(long userId);

}
