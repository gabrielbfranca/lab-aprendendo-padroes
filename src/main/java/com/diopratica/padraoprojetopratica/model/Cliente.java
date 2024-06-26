package com.diopratica.padraoprojetopratica.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

}