package mate.academy.liquibase.dao;

import mate.academy.liquibase.model.Actor;

import java.util.Optional;

public interface ActorDao {
    Actor save(Actor actor);

    Optional<Actor> findById(Long id);
}
