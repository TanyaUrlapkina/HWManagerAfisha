package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();

    @Test
    public void shouldRemoveMovie() {

        Movies first = new Movies(1, 1, "action", "BloodShot");
        Movies second = new Movies(2, 2, "cartoon", "Onward");
        Movies third = new Movies(3, 3, "comedy", "Belgrade Hotel");
        Movies forth = new Movies(4, 4, "action", "Gentlemen");
        Movies fifth = new Movies(5, 5, "horror", "Invisible Man");
        Movies sixth = new Movies(6, 6, "cartoon", "Trolls World Tour");
        Movies seventh = new Movies(7, 7, "comedy", "Number one");

        Manager manager = new Manager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);

        manager.removeId(5);

        Movies[] expected = {first, second, third, forth};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGet3Movies() {

        Movies first = new Movies(1, 1, "action", "BloodShot");
        Movies second = new Movies(2, 2, "cartoon", "Onward");
        Movies third = new Movies(3, 3, "comedy", "Belgrade Hotel");

        Manager manager = new Manager();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movies[] actual = manager.findLast();
        Movies[] expected = new Movies[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldMax5Movies() {

        Movies first = new Movies(1, 1, "action", "BloodShot");
        Movies second = new Movies(2, 2, "cartoon", "Onward");
        Movies third = new Movies(3, 3, "comedy", "Belgrade Hotel");
        Movies forth = new Movies(4, 4, "action", "Gentlemen");
        Movies fifth = new Movies(5, 5, "horror", "Invisible Man");
        Movies sixth = new Movies(6, 6, "cartoon", "Trolls World Tour");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.save(sixth);

        manager.removeId(6);

        Movies[] expected = {fifth, forth, third, second, first};
        Movies[] actual = manager.getMax(5);
    }
}