package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    @Test

    public void testAddMovies3() {//добавляем 3 фильма и выводим их.
        Afisha afisha = new Afisha();
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");

        String[] expected = {"Movie1", "Movie2", "Movie3"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindAll() {//добавляем 13 фильмов и выводим все.
        Afisha afisha = new Afisha();
        afisha.add("movie1");
        afisha.add("movie2");
        afisha.add("movie3");
        afisha.add("movie4");
        afisha.add("movie5");
        afisha.add("movie6");
        afisha.add("movie7");
        afisha.add("movie8");
        afisha.add("movie9");
        afisha.add("movie10");
        afisha.add("movie11");
        afisha.add("movie12");
        afisha.add("movie13");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10", "movie11", "movie12", "movie13"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10() { //вывести последние 10 фильмов(всего 13),лимит можно менять.(конструктор с переменной лимит.)
        Afisha afisha = new Afisha(10);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");
        afisha.add("movie 11");
        afisha.add("movie 12");
        afisha.add("movie 13");

        String[] expect = {"movie 13", "movie 12", "movie 11", "movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expect, actual);

    }

    @Test
    public void findLast1() { //вывести последний добавленный фильм(всего 13),лимит можно менять.(конструктор с переменной лимит.)
        Afisha afisha = new Afisha(1);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");
        afisha.add("movie 7");
        afisha.add("movie 8");
        afisha.add("movie 9");
        afisha.add("movie 10");
        afisha.add("movie 11");
        afisha.add("movie 12");
        afisha.add("movie 13");

        String[] expect = {"movie 13"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expect, actual);

    }

    @Test
    public void findLast5() { //лимит 10,но фильмов всего 5,то выводим сколько есть.
        Afisha afisha = new Afisha(10);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");


        String[] expect = {"movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expect, actual);

    }
}

