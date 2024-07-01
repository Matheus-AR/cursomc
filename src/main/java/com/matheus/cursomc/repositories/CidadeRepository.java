package com.matheus.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
