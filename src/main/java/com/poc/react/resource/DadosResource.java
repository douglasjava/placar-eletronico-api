package com.poc.react.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.react.model.Dados;
import com.poc.react.repository.DadosRepository;

@RestController
@RequestMapping("/dados")
@CrossOrigin("${origem-permitida}")
public class DadosResource {

	@Autowired
	private DadosRepository dadosRepository;

	@GetMapping(produces = "application/json")
	private List<Dados> listar() {
		return dadosRepository.findAll();
	}

}
