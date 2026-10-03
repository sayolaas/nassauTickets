package com.nassau.tickets.controller;

import com.nassau.tickets.model.Ticket;
import com.nassau.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/emitir")
    public ResponseEntity<?> emitirSenha(@RequestBody TicketRequest request) {
        try {
            Ticket novoTicket = ticketService.emitirSenha(request.getTipo());
            return ResponseEntity.status(HttpStatus.CREATED).body(novoTicket);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    public static class TicketRequest {
        private String tipo;
        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
    }
}
