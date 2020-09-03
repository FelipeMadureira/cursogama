package br.gama.loja.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gama.loja.dao.PedidoDAO;
import br.gama.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {
    
    @Autowired
    private PedidoDAO dao;

    //buscar um pedido por número do pedido
    @GetMapping("/pedido/{id}")
    public ResponseEntity<Pedido> buscaPorId(@PathVariable int id){
        Pedido pedido = dao.findById(id).orElse(null);

        if(pedido != null){
            return ResponseEntity.ok(pedido);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    //listar todos os pedidos
    @GetMapping("/pedidos")
    public List<Pedido> listarTodos(){
        List<Pedido> lista = (List<Pedido>) dao.findAll();
        return lista;
    }

    //listar todos os pedidos por status
    @GetMapping("/pedidos/status/{status}")
    public List<Pedido> buscaPorStatus(@PathVariable char status){
        List<Pedido> lista = dao.findByStatus(status);
        return lista;
    }

    //atualizar o status do pedido
    @PutMapping("/pedidos/status")
    public ResponseEntity<Boolean> alterarStatus(@RequestBody Pedido pedidoUser){
        Pedido pedido = dao.findById(pedidoUser.getNumPedido()).orElse(null);

        if(pedido != null){
            pedido.setStatus(pedidoUser.getStatus());
            dao.save(pedido);
            return ResponseEntity.ok(true);
        }else{
            return ResponseEntity.ok(false);
        }

    }

    //listar todos os pedidos por data
    @GetMapping("/pedidos/data")
    public List<Pedido> buscaPorData(@RequestParam(name="dataagendamento") String dataAgendamento){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dataAgendamento, fmt);
        return dao.findAllByData(data);
    }
}