package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActorMapper {
    int deleteByPrimaryKey(Integer actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Integer actorId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}
