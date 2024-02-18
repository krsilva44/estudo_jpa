package org.hibernate.tutorial.envers.model.tipo1;


import javax.persistence.*;

@Entity
@Table
public class Livro2 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String descricao;

    @ManyToOne(fetch = FetchType.EAGER)
    private Editora1 editora;

}
