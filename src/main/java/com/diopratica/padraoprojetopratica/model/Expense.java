package com.diopratica.padraoprojetopratica.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private double value;
    private String category;
    private String date;
    @ManyToOne(fetch = FetchType.LAZY) // Optional optimization
    private Cliente cliente;
}
