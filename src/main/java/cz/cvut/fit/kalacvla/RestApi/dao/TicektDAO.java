package cz.cvut.fit.kalacvla.RestApi.dao;



import cz.cvut.fit.kalacvla.RestApi.model.Ticket;

import java.util.List;

public interface TicektDAO {
    List<Ticket> allTickets();
    void add(Ticket ticket);
    void delete(Ticket ticket);
    void edit(Ticket ticket);
    Ticket getById(int id);
}
