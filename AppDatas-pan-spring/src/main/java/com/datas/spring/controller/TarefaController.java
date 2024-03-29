package com.datas.spring.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datas.spring.model.Tarefas;
import com.datas.spring.repo.TarefasRepository;

@RestController
@RequestMapping(value = "/api")
public class TarefaController {

    Calendar c1 = Calendar.getInstance();
    int hora = c1.get(Calendar.HOUR_OF_DAY);

    @Autowired
    private TarefasRepository tarefasRepository;

    @GetMapping
    public List<Tarefas> findAll() {
        return tarefasRepository.findAll();
    }

    @GetMapping(value = "/tarefas")
    public ResponseEntity<List<Tarefas>> getAll() {
        if (hora > 14 && hora < 17){
            System.out.println("Entrou, dentro do horário");
            return ResponseEntity.ok(tarefasRepository.findAll());
        } else {
            System.out.println("Fora do horário");
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<Tarefas> post (@RequestBody Tarefas tarefinha) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(tarefasRepository.save(tarefinha));
    }
}