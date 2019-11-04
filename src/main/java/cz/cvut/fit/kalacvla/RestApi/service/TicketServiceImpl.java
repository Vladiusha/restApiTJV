package cz.cvut.fit.kalacvla.RestApi.service;


import cz.cvut.fit.kalacvla.RestApi.dao.TicektDAO;
import cz.cvut.fit.kalacvla.RestApi.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    private TicektDAO ticektDAO;

    @Autowired
    public void setTicektDAO(TicektDAO ticektDAO) {
        this.ticektDAO = ticektDAO;
    }

    @Override
    @Transactional
    public List<Ticket> allTickets() {
        return ticektDAO.allTickets();
    }

    @Override
    @Transactional
    public void add(Ticket ticket) {
        ticektDAO.add(ticket);
    }

    @Override
    @Transactional
    public void delete(Ticket ticket) {
        ticektDAO.delete(ticket);
    }

    @Override
    @Transactional
    public void edit(Ticket ticket) {
        ticektDAO.edit(ticket);
    }

    @Override
    @Transactional
    public Ticket getById(int id) {
        return ticektDAO.getById(id);
    }
}
