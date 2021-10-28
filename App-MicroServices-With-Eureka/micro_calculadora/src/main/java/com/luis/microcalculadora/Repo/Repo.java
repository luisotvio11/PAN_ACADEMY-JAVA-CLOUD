package com.luis.microcalculadora.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.microcalculadora.model.Calculadora;
import com.luis.microcalculadora.model.Tabela;

public interface Repo extends JpaRepository<Calculadora, Long>{

}
