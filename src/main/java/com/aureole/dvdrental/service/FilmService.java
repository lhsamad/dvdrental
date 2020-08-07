package com.aureole.dvdrental.service;

import com.aureole.dvdrental.domain.FilmList;
import com.aureole.dvdrental.mapper.FilmListMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilmService {

    @Autowired
    private FilmListMapper filmListMapper;

    public Page<FilmList> findByPage(int pageNo, int pageSize, String sortBy) {
        PageHelper.startPage(pageNo, pageSize, sortBy); //line 1
        return filmListMapper.findByPage(); //line 2
    }
}
