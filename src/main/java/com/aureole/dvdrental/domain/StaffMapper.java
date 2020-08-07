package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKeyWithBLOBs(Staff record);

    int updateByPrimaryKey(Staff record);
}
