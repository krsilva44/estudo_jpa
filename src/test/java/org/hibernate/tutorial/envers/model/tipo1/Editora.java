package org.hibernate.tutorial.envers.model.tipo1;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "editora")
    private Set<Livro> livros;
}
