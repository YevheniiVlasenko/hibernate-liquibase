package mate.academy.liquibase.dao;

import mate.academy.liquibase.model.Country;

import java.util.Optional;

public interface CountryDao {
    Country save(Country country);

    Optional<Country> findById(Long id);
}
