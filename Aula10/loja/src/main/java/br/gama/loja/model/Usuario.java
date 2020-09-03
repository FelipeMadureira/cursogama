package br.gama.loja.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="usuario")
public class Usuario {

    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-numeração
    @Column(name="id")
    private int id;

    @Column(name="nome", length = 100, nullable = false)
    private String nome;

    @Column(name="email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name="cpf", length = 20, nullable = false, unique = true)
    private String cpf;

    @Column(name="senha", length = 20, nullable = false)
    private String senha;

    @Column(name = "linkfoto")
    private String linkFoto;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitante")
    @JsonIgnoreProperties("solicitante")
    private List<Pedido> pedidos;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    
}