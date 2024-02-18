package org.hibernate.tutorial.envers.model.tipo3;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
@SequenceGenerator(name = "palestrante_seq", sequenceName = "palestrante_seq", allocationSize = 1, initialValue = 1)
public class Palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "palestrante_seq")
    private Long id;

    @Column
    private  String descricao;

    @ManyToMany(mappedBy = "palestrantes")
    private List<Palestra> palestras;

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

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(List<Palestra> palestras) {
        this.palestras = palestras;
    }
}
