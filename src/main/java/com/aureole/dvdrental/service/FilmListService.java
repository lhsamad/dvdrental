package com.aureole.dvdrental.service;

import com.aureole.dvdrental.domain.Film;
import com.aureole.dvdrental.domain.FilmList;
import com.aureole.dvdrental.mapper.FilmListMapper;
import com.aureole.dvdrental.mapper.FilmMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilmListService {

    @Autowired
    private FilmListMapper filmListMapper;

    @Autowired
    private FilmMapper filmMapper;

    public Page<FilmList> findByPage(Integer pageNo, Integer pageSize, String sortBy) {
        PageHelper.startPage(pageNo, pageSize, sortBy); //line 1
        return filmListMapper.findByPage(); //line 2
    }

    public Film findById(Integer filmId) {
        return filmMapper.selectByPrimaryKey(filmId);
    }
}
