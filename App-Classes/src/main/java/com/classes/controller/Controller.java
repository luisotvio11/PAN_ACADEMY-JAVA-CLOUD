package com.classes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.repository.ProdutoRepository;
import com.classes.tabelas.Produtos;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/retornoString")
    public String metodo() {
        return "hello";
    }

    @GetMapping("/retornoNumero")
    public int idade() {
        return 1;
    }

    public List<Produtos> buscarTodos(){
        return produtoRepository.findAll();
    }


}
