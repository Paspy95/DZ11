package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    public void  emptyFilms(){
        MovieManager manager=new MovieManager();
        String[]expected={};
        String[]actual=manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void addFilms(){
        MovieManager manager=new MovieManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель <Белград>");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-неведимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");

        String[]expecter={"Бладшот","Вперёд","Отель <Белград>","Джентельмены","Человек-неведимка","Тролли.Мировой тур","Номер один"};
        String[]actual=manager.findAll();

        Assertions.assertArrayEquals(expecter,actual);
    }

    @Test
    public void reversedFilms(){
        MovieManager manager=new MovieManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель <Белград>");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-неведимка");

        String[]expecter={"Человек-неведимка","Джентельмены","Отель <Белград>","Вперёд","Бладшот"};
        String[]actual=manager.reversedFilms();

        Assertions.assertArrayEquals(expecter,actual);
    }

    @Test
    public void reversedFilms2(){
        MovieManager manager=new MovieManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель <Белград>");

        String[]expecter={"Отель <Белград>","Вперёд","Бладшот"};
        String[]actual=manager.reversedFilms();

        Assertions.assertArrayEquals(expecter,actual);
    }

    @Test
    public void reversedFilms3(){
        MovieManager manager=new MovieManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель <Белград>");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-неведимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");

        String[]expecter={"Номер один","Тролли.Мировой тур","Человек-неведимка","Джентельмены","Отель <Белград>"};
        String[]actual=manager.reversedFilms();

        Assertions.assertArrayEquals(expecter,actual);
    }

    @Test
    public void reversedFilms4(){
        MovieManager manager=new MovieManager(4);
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель <Белград>");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-неведимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");

        String[]expecter={"Номер один","Тролли.Мировой тур","Человек-неведимка","Джентельмены"};
        String[]actual=manager.reversedFilms();

        Assertions.assertArrayEquals(expecter,actual);
    }




}