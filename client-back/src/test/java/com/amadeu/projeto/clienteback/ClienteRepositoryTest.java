package com.amadeu.projeto.clienteback;

import com.amadeu.projeto.clienteback.domain.Cliente;
import com.amadeu.projeto.clienteback.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@Transactional
public class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void deveSalvarUmCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("travor");
        cliente.setEmail("travor@email.com");
        cliente.setTelefone(0000);

        Cliente clienteSalvo = clienteRepository.save(cliente);

        assertNotNull(clienteSalvo.getId());

        System.out.println("ID do cliente salvo: " + clienteSalvo.getId());
    }
}
