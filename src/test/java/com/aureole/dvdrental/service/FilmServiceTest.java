package com.aureole.dvdrental.service;

import com.aureole.dvdrental.domain.NicerButSlowerFilmList;
import com.aureole.dvdrental.service.FilmService;
import com.github.pagehelper.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmServiceTest {

    @Autowired
    private FilmService filmService;

    @Test
    public void testFindByPage() {
        Page<NicerButSlowerFilmList> films = filmService.findByPage(1, 10);//Query pageNo=1, pageSize=2
        assertEquals(films.getTotal(), 997);
        assertEquals(films.getPages(), 100);
        System.out.println(films.toString());
    }
}
