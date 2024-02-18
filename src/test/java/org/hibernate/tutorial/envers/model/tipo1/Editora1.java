package org.hibernate.tutorial.envers.model.tipo1;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Editora1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "editora")
    private List<Livro1> livro;

    @OneToMany(mappedBy = "editora")
    private List<Livro2> livro2;
}
