package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActorInfoMapper {
    List<ActorInfo> findAllActorInfos();

    ActorInfo findUserByActorId(Long actorId);
}
