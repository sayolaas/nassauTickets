package com.nassau.tickets.service;

import com.nassau.tickets.model.Ticket;
import com.nassau.tickets.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket emitirSenha(String tipo) {
        if (!tipo.equals("SP") && !tipo.equals("SG") && !tipo.equals("SE")) {
            throw new IllegalArgumentException("Tipo de senha inválido. Use SP, SG ou SE.");
        }

        long totalTipo = ticketRepository.countByTipo(tipo) + 1;
        LocalDate hoje = LocalDate.now();
        String yyMmDd = hoje.format(DateTimeFormatter.ofPattern("yyMMdd"));
        String sequenciaStr = String.format("%03d", totalTipo);
        
        String numeroFormatado = yyMmDd + "-" + tipo + sequenciaStr;

        Ticket ticket = new Ticket();
        ticket.setNumero(numeroFormatado);
        ticket.setTipo(tipo);
        ticket.setEstado("EMITIDA");

        return ticketRepository.save(ticket);
    }
}
