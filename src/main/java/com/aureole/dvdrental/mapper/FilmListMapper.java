package com.aureole.dvdrental.mapper;

import com.aureole.dvdrental.domain.FilmList;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FilmListMapper {
    @Select("SELECT fid, title, description, category, price, length, rating, actors FROM film_list")
    Page<FilmList> findByPage();
}
