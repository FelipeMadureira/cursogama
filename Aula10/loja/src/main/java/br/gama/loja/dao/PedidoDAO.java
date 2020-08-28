package br.gama.loja.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.gama.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository <Pedido, Integer>{
    
    @Query(value="Select p from Pedido p INNER JOIN Usuario u ON u.id = p.solicitante.id WHERE u.id = :id And p.status = 'P'")
    public List<Pedido> buscaPendentesPorId(@Param("id") Integer id);
}