package br.madureira.springsample2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idproj")
    private int idProj;

    @Column(name="descrp")
    private String descProj;

    public int getIdProj() {
        return idProj;
    }

    public void setIdProj(int idProj) {
        this.idProj = idProj;
    }

    public String getDescProj() {
        return descProj;
    }

    public void setDescProj(String descProj) {
        this.descProj = descProj;
    }

	public Object findById(int cod) {
		return null;
	}

	public List<Projeto> findAll() {
		return null;
	}

}