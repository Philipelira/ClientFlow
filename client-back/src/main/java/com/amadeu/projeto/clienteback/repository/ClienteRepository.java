package com.amadeu.projeto.clienteback.repository;

import com.amadeu.projeto.clienteback.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
