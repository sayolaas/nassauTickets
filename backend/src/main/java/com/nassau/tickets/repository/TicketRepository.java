package com.nassau.tickets.repository;

import com.nassau.tickets.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Query("SELECT COUNT(t) FROM Ticket t WHERE t.tipo = :tipo")
    long countByTipo(String tipo);
}
