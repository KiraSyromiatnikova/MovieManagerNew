package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MovieItem {
    private int movieId;
    private String movieName;
    private String imageUrl;
    private String name;
    private String genre;

    public MovieItem(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }
}
