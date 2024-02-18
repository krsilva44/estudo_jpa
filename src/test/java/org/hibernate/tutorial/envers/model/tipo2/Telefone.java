package org.hibernate.tutorial.envers.model.tipo2;

import javax.persistence.*;

@Entity
@Table
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String numero;

    @ManyToOne
    private Pessoa pessoa;

}
