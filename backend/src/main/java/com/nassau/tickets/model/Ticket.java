package com.nassau.tickets.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "senhas")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numero;

    @Column(nullable = false)
    private String tipo; // 'SP', 'SG', 'SE'

    @Column(nullable = false)
    private String estado = "EMITIDA";

    private Integer guiche;
    private String atendente;

    @Column(nullable = false)
    private LocalDateTime dataEmissao = LocalDateTime.now();

    private LocalDateTime dataAtendimento;
    private LocalDateTime dataFinalizacao;
    private Integer chamadaContador = 0;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Integer getGuiche() { return guiche; }
    public void setGuiche(Integer guiche) { this.guiche = guiche; }

    public String getAtendente() { return atendente; }
    public void setAtendente(String atendente) { this.atendente = atendente; }

    public LocalDateTime getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDateTime dataEmissao) { this.dataEmissao = dataEmissao; }

    public LocalDateTime getDataAtendimento() { return dataAtendimento; }
    public void setDataAtendimento(LocalDateTime dataAtendimento) { this.dataAtendimento = dataAtendimento; }

    public LocalDateTime getDataFinalizacao() { return dataFinalizacao; }
    public void setDataFinalizacao(LocalDateTime dataFinalizacao) { this.dataFinalizacao = dataFinalizacao; }

    public Integer getChamadaContador() { return chamadaContador; }
    public void setChamadaContador(Integer chamadaContador) { this.chamadaContador = chamadaContador; }
}
