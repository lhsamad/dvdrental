package com.aureole.dvdrental.service;

import com.aureole.dvdrental.domain.Film;
import com.aureole.dvdrental.domain.FilmList;
import com.github.pagehelper.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmListServiceTest {

    @Autowired
    private FilmListService filmListService;

    @Test
    public void testFindByPage() {
        Page<FilmList> films = filmListService.findByPage(1, 10, "fid");
        assertEquals(films.getTotal(), 997);
        assertEquals(films.getPages(), 100);
        System.out.println(films.toString());
    }

    @Test
    public void testFindFilm() {
        Film film = filmListService.findById(1);
        System.out.println(film.toString());
    }
}
