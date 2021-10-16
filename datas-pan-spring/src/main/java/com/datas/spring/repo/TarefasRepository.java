package com.datas.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datas.spring.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
}
