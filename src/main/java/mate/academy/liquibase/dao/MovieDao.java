package mate.academy.liquibase.dao;

import mate.academy.liquibase.model.Movie;

import java.util.Optional;

public interface MovieDao {
    Movie save(Movie movie);

    Optional<Movie> findById(Long id);
}
