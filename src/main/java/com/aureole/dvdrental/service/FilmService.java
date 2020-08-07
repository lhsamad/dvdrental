package com.aureole.dvdrental.service;

import com.aureole.dvdrental.domain.NicerButSlowerFilmList;
import com.aureole.dvdrental.mapper.NicerButSlowerFilmListMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilmService {

    @Autowired
    private NicerButSlowerFilmListMapper nicerButSlowerFilmListMapper;

    public Page<NicerButSlowerFilmList> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize); //line 1
        return nicerButSlowerFilmListMapper.findByPage(); //line 2
    }
}
