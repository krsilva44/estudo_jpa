package org.hibernate.tutorial.envers.model.tipo1;


import javax.persistence.*;

@Entity
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    private Editora editora;
}
