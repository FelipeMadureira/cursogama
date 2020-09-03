package br.gama.loja.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gama.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository <Pedido, Integer> {
    public List<Pedido> findByStatus(char status);
    public List<Pedido> findAllByData(LocalDate data);
}