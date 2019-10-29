package com.centralbookexchange.webapp.service;

import com.centralbookexchange.webapp.dao.PersonDAO;
import com.centralbookexchange.webapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * This class includes the logic of the application.
 */

@Service
public class PersonService {

    private final PersonDAO personDAO;

    /**
     * Change the 'fakeDao' @Qualifier to where your database is coming from.
     * Connects to an implementation of a DAO through the @Repository tag.
     */
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDAO.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDAO.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person) {
        return personDAO.updatePersonById(id, person);
    }

}
