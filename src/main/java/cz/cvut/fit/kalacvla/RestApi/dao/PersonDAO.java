package cz.cvut.fit.kalacvla.RestApi.dao;


import cz.cvut.fit.kalacvla.RestApi.model.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> allPersons();
    void add(Person person);
    void delete(Person person);
    void edit(Person person);

    void addPassportToPerson(int id);

    Person getById(int id);
}
