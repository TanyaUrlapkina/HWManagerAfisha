package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {
    Movies one = new Movies(1, "Name1");
    Movies two = new Movies(2, "Name2");
    Movies three = new Movies(3, "Name3");
    Movies four = new Movies(4, "Name4");
    Movies five = new Movies(5, "Name5");
    Movies six = new Movies(6, "Name6");
    Movies seven = new Movies(7, "Name7");
    Movies eight = new Movies(8, "Name8");
    Movies nine = new Movies(9, "Name9");
    Movies ten = new Movies(10, "Name10");
    Movies eleven = new Movies(11, "Name11");

    @Test
    public void movieLimit() {
        MoviesManager manager = new MoviesManager();
        int actual = manager.getManagerLimit();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void addMovies() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        Movies[] expected = {one, two, three};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void missingMovies() {
        MoviesManager manager = new MoviesManager();
        Movies[] expected = {};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenMovies() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Movies[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllMovies() {
        MoviesManager manager = new MoviesManager(11);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Movies[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showTenMovies() {
        MoviesManager manager = new MoviesManager(10);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Movies[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Movies[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMovies() {
        MoviesManager manager = new MoviesManager(3);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);

        Movies[] expected = {four, three, two};
        Movies[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}