package br.com.cadastro.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.clientes.modelos.Cliente;

// Essa é a camada utilizada pela classe cliente para acessar o banco de dados.
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
