package br.com.cadastro.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.clientes.modelos.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
