package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}
