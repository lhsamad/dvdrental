package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    int deleteByPrimaryKey(Integer paymentId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer paymentId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}
