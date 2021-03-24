package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class AfishaManager {
    private MovieItem[] items = new MovieItem[0];
    private final int returnMovies;

    public AfishaManager(int returnMovies) {
        if (returnMovies <= 0) {
            throw new IllegalArgumentException("Movies count should more than 0");
        }
        this.returnMovies = returnMovies;
    }

    public AfishaManager() {
        this.returnMovies = 10;
    }



    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public MovieItem[] getAll() {
        int resultSize = items.length > returnMovies ? returnMovies : items.length;
        MovieItem[] result = new MovieItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


    public void removeById(int movieId) {
        int length = items.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getMovieId() != movieId) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}
