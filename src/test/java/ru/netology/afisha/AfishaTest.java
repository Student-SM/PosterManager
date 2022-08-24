package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test

    public void testAddMovies() {


        Afisha afisha = new Afisha();

        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");

        String[] expected = {"movie 1", "movie 2", "movie 3"};
        String[] actual = afisha.findAll();


        Assertions.assertArrayEquals(expected, actual);

    }
}

