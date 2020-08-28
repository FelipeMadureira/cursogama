package br.gama.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.gama.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository <Pedido, Integer>{
    
}