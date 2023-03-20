# e_wallet

业务背景：电商业务中，需要给电商app设计一个用户钱包，用户可以往钱包中充值，购买商品时用户可以使用钱包中的钱消费，商品申请退款成功后钱会退回钱包中，用户也可以申请提现把钱提到银行卡中
用程序实现如下api接口
 1.  查询用户钱包余额
2. 用户消费100元的接口
3. 用户退款20元接口
4. 查询用户钱包金额变动明细的接口


端口号：8080


一、表SQL
--record，订单记录表，id为主键标识，user_id为关联字段，amount是交易金额
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) NOT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `type` enum('消费','退款') DEFAULT NULL COMMENT '状态 1:消费 2:退款',
  `date` datetime DEFAULT NULL COMMENT '订单时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

--wallet钱包表，user_id为主键字段，balance为余额
CREATE TABLE `wallet` (
  `user_id` bigint(100) NOT NULL,
  `balance` decimal(10,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


二、实现接口
1.查询用户钱包余额
url: http://localhost:8080/wallet/find/3120004944
3120004944为自测试的user_id
实现：WalletController.findBalance(@PathVariable("userId") long userId)

2.用户消费100元的接口
url：http://localhost:8080/record/consume/3120004944       
3120004944为自测试的user_id
实现：RecordController.insertByIdConsume100(@PathVariable("userId")long userId)

3. 用户退款20元接口
url：http://localhost:8080/record/add/3120004944  
3120004944为自测试的user_id
实现：RecordController.insertByIdAdd20(@PathVariable("userId")long userId)


4. 查询用户钱包金额变动明细的接口
url： http://localhost:8080/record/find?userId=3120004944
3120004944为自测试的user_id
在代码中RecordController类的findByUserId(long userId)方法


