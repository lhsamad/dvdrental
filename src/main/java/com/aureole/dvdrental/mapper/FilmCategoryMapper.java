package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.FilmCategory;
import com.aureole.dvdrental.domain.FilmCategoryKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FilmCategoryMapper {
    int deleteByPrimaryKey(FilmCategoryKey key);

    int insert(FilmCategory record);

    int insertSelective(FilmCategory record);

    FilmCategory selectByPrimaryKey(FilmCategoryKey key);

    int updateByPrimaryKeySelective(FilmCategory record);

    int updateByPrimaryKey(FilmCategory record);
}
