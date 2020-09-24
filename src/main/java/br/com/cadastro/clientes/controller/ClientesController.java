package br.com.cadastro.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.clientes.modelos.Cliente;
import br.com.cadastro.clientes.service.ClienteService;

//Essa é a classe controladora, o ponto de entrada da requisição
@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public List<Cliente> buscarTodos() {
		return service.buscarTodos();
	}
	
	@PostMapping
	public Cliente inserir(@RequestBody Cliente cliente) {
		return service.inserir(cliente);
	}
	
	/*
	@GetMapping
	public ResponseEntity<List<Cliente>> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	*/
}
