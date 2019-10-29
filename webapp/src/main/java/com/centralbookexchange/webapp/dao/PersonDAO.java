package com.centralbookexchange.webapp.dao;

import com.centralbookexchange.webapp.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    // Insert a new person with an id
    int insertPerson(UUID id, Person person);

    // Insert a person without an id (randomly generate)
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
