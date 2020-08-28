package br.gama.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gama.loja.dao.UsuarioDAO;
import br.gama.loja.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuario/{id}")
    public ResponseEntity <Usuario> buscaUsuario(@PathVariable int id){
        Usuario usuario = dao.findById(id).orElse(null);

        if (usuario != null){
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/usuario/novo")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario user){
        try {
            Usuario novo = dao.save(user); //salva usuario banco dados
            return ResponseEntity.ok(novo); //retorna os dados do usuario inserido no BD
        }catch(Exception e){
            return ResponseEntity.status(400).build(); //400 = bad request (dados incorretos)
        }
    }

    @PostMapping("/usuario/update")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario user){
        try {
            if (user.getId() > 0){
                Usuario novo = dao.save(user); //salva usuario banco dados
                return ResponseEntity.ok(novo); //retorna os dados do usuario inserido no BD
            } else {
                return ResponseEntity.status(404).build(); //404 = usuario não existe
            }

        }catch(Exception e){
            return ResponseEntity.status(400).build(); //400 = bad request (dados incorretos)
        }
    }

    @PostMapping("/usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user){
        Usuario userFinded = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());

        if(userFinded != null){
            userFinded.setSenha("*********");
            return ResponseEntity.ok(userFinded);
        } else {
            return ResponseEntity.status(403).build();
        }

    }

    @GetMapping("/usuario/pedidos/{id}")
    public List<Usuario> getUsuariosPedidos(@PathVariable int id){
        List<Usuario> lista = dao.buscaPorId(id);

        return lista;
    }
}