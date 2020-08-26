package br.madureira.springsample2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="iddepto")
    private int id;

    @Column(name="nomedep", length=50)
    private String nome;

    @Column(name="andar")
    private int andar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}