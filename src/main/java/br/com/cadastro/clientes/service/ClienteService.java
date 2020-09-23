package br.com.cadastro.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.clientes.modelos.Cliente;
import br.com.cadastro.clientes.repository.ClienteRepository;

//Essa é a classe responsável por ter a regra de negócios. Qualquer tipo de regra fica aqui.
//Ex. não ter cpf duplicados.
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscarPorId(Long id) {
		return this.repository.findById(id).get();
	}
	
	public Cliente inserir(Cliente cliente) {
		return this.repository.save(cliente);
	}
	
	public List<Cliente> buscarTodos() {
		return this.repository.findAll();
	}
}
