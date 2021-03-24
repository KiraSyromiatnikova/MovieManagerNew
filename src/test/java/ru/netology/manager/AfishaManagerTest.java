package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestAfishaManager {
    private AfishaManager manager = new AfishaManager();
    private MovieItem first = new MovieItem(1,  "first" );
    private MovieItem second = new MovieItem(2, "second");
    private MovieItem third = new MovieItem(3,  "third");
    private MovieItem fourth = new MovieItem(4,  "fourth");
    private MovieItem fifth = new MovieItem(5,  "fifth");
    private MovieItem sixth = new MovieItem(6,  "sixth");
    private MovieItem seventh = new MovieItem(7,  "seventh");
    private MovieItem eighth = new MovieItem(8,  "eighth");
    private MovieItem ninth = new MovieItem(9,  "ninth");
    private MovieItem tenth = new MovieItem(3,  "tenth");
    private MovieItem eleventh = new MovieItem(11,  "eleventh");
    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
    }

    @Test
    public void shouldGet10() {
        AfishaManager manager = new AfishaManager();
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth,ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldRemoveIfExistsLast() {
        int idToRemove = 11;
        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExistsFirst() {
        int idToRemove = 1;

        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{eleventh,tenth,ninth,eighth,seventh,sixth,fifth,fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}
