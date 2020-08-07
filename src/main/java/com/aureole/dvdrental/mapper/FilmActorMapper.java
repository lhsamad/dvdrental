package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.FilmActor;
import com.aureole.dvdrental.domain.FilmActorKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmActorMapper {
    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}
