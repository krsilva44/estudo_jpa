package org.hibernate.tutorial.envers.model.tipo3;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
@SequenceGenerator(name = "palestra_seq", sequenceName = "palestra_seq", initialValue = 1, allocationSize = 1)
public class Palestra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "palestra_seq")
    private Long id;

    @Column
    private String descricao;

    @ManyToMany
    @JoinTable(name = "vinculo_palestra_palestrante",
            joinColumns = @JoinColumn(name = "palestra_id"),
            inverseJoinColumns = @JoinColumn(name = "palestrante_id"))
    private List<Palestrante> palestrantes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(List<Palestrante> palestrantes) {
        this.palestrantes = palestrantes;
    }
}
