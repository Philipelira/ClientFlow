package com.amadeu.projeto.minhaprimeiraapi.controller;

import com.amadeu.projeto.minhaprimeiraapi.domain.Cliente;
import com.amadeu.projeto.minhaprimeiraapi.repository.ClienteRepository;
import com.amadeu.projeto.minhaprimeiraapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> getTodosClientes(){
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClientePorId(@PathVariable Long id){
        return clienteService.buscarClientePorId(id);
    }

    @PutMapping("/{id}")
    public Cliente atualizarClientePorId(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.atualizarCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void removerClientePorId(@PathVariable Long id){
        clienteService.deletarCliente(id);
    }
}
