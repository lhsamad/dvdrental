package com.aureole.dvdrental.controller;

import com.aureole.dvdrental.domain.NicerButSlowerFilmList;
import com.aureole.dvdrental.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FilmConroller {

    @Autowired
    FilmService filmService;

    @GetMapping("/films")
    public ResponseEntity<List<NicerButSlowerFilmList>> getAllFilms(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        List<NicerButSlowerFilmList> list = filmService.findByPage(pageNo, pageSize);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
