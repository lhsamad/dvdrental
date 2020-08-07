package com.aureole.dvdrental.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LanguageMapper {
    int deleteByPrimaryKey(Integer languageId);

    int insert(Language record);

    int insertSelective(Language record);

    Language selectByPrimaryKey(Integer languageId);

    int updateByPrimaryKeySelective(Language record);

    int updateByPrimaryKey(Language record);
}