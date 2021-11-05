package com.luis.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
