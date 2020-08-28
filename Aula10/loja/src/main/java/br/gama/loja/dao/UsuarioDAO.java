package br.gama.loja.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.gama.loja.model.Usuario;

public interface UsuarioDAO extends CrudRepository <Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email, String senha);

    @Query(value="Select u from Usuario u INNER JOIN Pedido p ON u.id = p.solicitante.id WHERE u.id = :id")
    public List<Usuario> buscaPorId(@Param("id") Integer id);
}