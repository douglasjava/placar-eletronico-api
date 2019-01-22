package com.poc.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.react.model.Dados;

public interface DadosRepository extends JpaRepository<Dados, Long> {

}
