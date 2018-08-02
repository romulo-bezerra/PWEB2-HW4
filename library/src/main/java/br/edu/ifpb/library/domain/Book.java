package br.edu.ifpb.library.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;
    private String autor;
    private Status status;

}

enum Status {

    RESERVA_PENDENTE,
    RESERVA_REALIZADA,
    RESERVA_REJEITADA

}