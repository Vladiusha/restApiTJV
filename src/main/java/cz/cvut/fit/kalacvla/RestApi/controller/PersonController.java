package cz.cvut.fit.kalacvla.RestApi.controller;

import cz.cvut.fit.kalacvla.RestApi.model.Person;
import cz.cvut.fit.kalacvla.RestApi.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public void hello(){
        System.out.println("hello");
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.allPersons();
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable(value = "id") int id){
        return personService.getById(id);
    }

    @DeleteMapping("/persons/{id}")
    public List<Person> deletePerson(@PathVariable(value = "id") int id) {
        personService.delete(personService.getById(id));
        return personService.allPersons();
    }

    @PostMapping("/persons/passport/{id}")
    public void addPassportToPerson( @PathVariable(value = "id") int id ) {
        personService.addPassportToPerson(id);
    }

    public List<Person> deletePerson1(@PathVariable(value = "id") int id) {
        personService.delete(personService.getById(id));
        return personService.allPersons();
    }



}
