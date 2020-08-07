package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.ActorInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActorInfoMapper {
    List<ActorInfo> findAllActorInfos();
    ActorInfo findUserByActorId(Long actorId);
}
