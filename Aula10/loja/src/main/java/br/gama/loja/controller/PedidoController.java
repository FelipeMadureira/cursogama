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

import br.gama.loja.dao.PedidoDAO;
import br.gama.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoDAO dao;

    //buscar um pedido por número do pedido
    @GetMapping("/pedido/{numPedido}")
    public ResponseEntity <Pedido>  buscaPedido(@PathVariable int numPedido){
        Pedido pedido = dao.findById(numPedido).orElse(null);

        if (pedido != null){
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //listar todos os pedidos
    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> listaTodos() {
        List<Pedido> pedidos = (List<Pedido>) dao.findAll();

        if (pedidos != null){
            return ResponseEntity.ok(pedidos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/pedido/novo")
    public ResponseEntity<Pedido> novoUsuario(@RequestBody Pedido user){
        try {
            Pedido novo = dao.save(user); //salva usuario banco dados
            return ResponseEntity.ok(novo); //retorna os dados do usuario inserido no BD
        }catch(Exception e){
            return ResponseEntity.status(400).build(); //400 = bad request (dados incorretos)
        }
    }
}