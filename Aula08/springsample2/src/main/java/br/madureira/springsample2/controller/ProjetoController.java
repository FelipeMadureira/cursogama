package br.madureira.springsample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.madureira.springsample2.dao.ProjetoDAO;
import br.madureira.springsample2.model.Projeto;

@RestController
@CrossOrigin("*")
public class ProjetoController { 
    
    @Autowired
    private ProjetoDAO dao;

    @GetMapping("/projetos")
    public List<Projeto> getProjetos(){
        List<Projeto> listaProj = (List<Projeto>) dao.findAll();
        return listaProj;
    }

    @GetMapping("/projeto/{cod}")
    public ResponseEntity <Projeto> findProjeto(@PathVariable int cod){
        Projeto projeto = dao.findById(cod).orElse(null);

        if (projeto != null){
            return ResponseEntity.ok(projeto);    
        }

        return ResponseEntity.status(404).build();
    }

}