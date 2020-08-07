package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}
