package br.madureira.springsample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.madureira.springsample2.dao.DepartamentoDAO;
import br.madureira.springsample2.model.Departamento;

@RestController
@CrossOrigin("*")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos(){
        List<Departamento> lista = (List<Departamento>) dao.findAll();
        return lista;
    }

}