package br.madureira.springsample2.dao;

import org.springframework.data.repository.CrudRepository;

import br.madureira.springsample2.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

    
    
}