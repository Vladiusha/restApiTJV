package cz.cvut.fit.kalacvla.RestApi.service;


import cz.cvut.fit.kalacvla.RestApi.dao.PersonDAO;
import cz.cvut.fit.kalacvla.RestApi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    @Autowired
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public List<Person> allPersons() {
        return personDAO.allPersons();
    }

    @Override
    @Transactional
    public void add(Person person) {
        personDAO.add(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDAO.delete(person);
    }

    @Override
    @Transactional
    public void edit(Person person) {
        personDAO.edit(person);
    }

    @Override
    @Transactional
    public Person getById(int id) {
        return personDAO.getById(id);
    }

    @Override
    public void addPassportToPerson(int id) {
        personDAO.addPassportToPerson(id);
    }
}
