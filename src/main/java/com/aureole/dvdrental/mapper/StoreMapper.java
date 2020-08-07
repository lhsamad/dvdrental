package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.Store;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeId);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}
