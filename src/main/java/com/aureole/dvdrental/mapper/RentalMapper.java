package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.Rental;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RentalMapper {
    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    int insertSelective(Rental record);

    Rental selectByPrimaryKey(Integer rentalId);

    int updateByPrimaryKeySelective(Rental record);

    int updateByPrimaryKey(Rental record);
}
