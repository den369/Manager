package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void showAllThree() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3"
        };

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showAllFifteen() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12",
                "film13",
                "film14",
                "film15"
        };

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showNull() {
        Manager manager = new Manager();
        manager.addFilm(null);

        String[] actual = manager.findAll();
        String[] expected = {null};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showNullNull() {
        Manager manager = new Manager(0);
        manager.addFilm(null);

        String[] actual = manager.findAll();
        String[] expected = {null};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void showLastTenOutOfFifteen() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] actual = manager.findLast();
        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6"
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFiveOutOfTen() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] actual = manager.findLast();
        String[] expected = {
                "film5",
                "film4",
                "film3",
                "film2",
                "film1",

        };

        assertArrayEquals(expected, actual);
    }

}