package com.centralbookexchange.webapp.api;

import com.centralbookexchange.webapp.model.Person;
import com.centralbookexchange.webapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    /**
     * Grabbing the id and adding to the RequestMapping path.
     * Add a valid UUID to the end of api/v1/person/{id} and it will return a person with that id.
     * We could add a personalized 404 Not Found if the person is not found.
     */
    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@Valid @NonNull @RequestBody Person person, @PathVariable("id") UUID id) {
        personService.updatePerson(id, person);
    }
}
