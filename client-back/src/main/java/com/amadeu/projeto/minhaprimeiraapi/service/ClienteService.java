package com.amadeu.projeto.minhaprimeiraapi.service;

import com.amadeu.projeto.minhaprimeiraapi.domain.Cliente;
import com.amadeu.projeto.minhaprimeiraapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente atualizarCliente(Long id, Cliente cliente) {
        Cliente clienteExistente = buscarClientePorId(id);
        if(clienteExistente != null){
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setEmail(cliente.getEmail());
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
