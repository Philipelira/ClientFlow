package com.amadeu.projeto.minhaprimeiraapi.repository;

import com.amadeu.projeto.minhaprimeiraapi.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
