package com.kelei.mapper;


import com.kelei.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecordMapper {

    List<Record> findAll();

//    用户消费100元的接口
    boolean insertByConsume100(@Param("userId") long userId,@Param("date")String date);

//    用户退款20元接口
    boolean insertByRefund20(@Param("userId") Long userId,@Param("date")String date);

//    查询用户钱包金额变动明细的接口
    List<Record> findByUserId(@Param("userId") long userId);
}
