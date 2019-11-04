package cz.cvut.fit.kalacvla.RestApi.controller;

import cz.cvut.fit.kalacvla.RestApi.model.Ticket;
import cz.cvut.fit.kalacvla.RestApi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public List<Ticket> getAllTickets(){
        return ticketService.allTickets();
    }
}
