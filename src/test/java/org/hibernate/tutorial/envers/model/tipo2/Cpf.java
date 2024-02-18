package org.hibernate.tutorial.envers.model.tipo2;

import org.hibernate.annotations.common.util.impl.Log;

import javax.persistence.*;

@Entity
@Table
@SequenceGenerator(name = "cpf_seq", sequenceName = "cpf_seq", initialValue = 1, allocationSize = 1)
public class Cpf {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cpf_seq")
    private Long id;

    @Column
    private String numero;

    @OneToOne
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
