package cz.cvut.fit.kalacvla.RestApi.service;


import cz.cvut.fit.kalacvla.RestApi.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> allPersons();
    void add(Person person);
    void delete(Person person);
    void edit(Person person);
    Person getById(int id);
}
