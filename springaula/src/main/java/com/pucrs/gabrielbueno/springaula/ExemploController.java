package com.pucrs.gabrielbueno.springaula;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    ArrayList<Livros> livros = new ArrayList<>();

    public ExemploController(){
        for(int i = 0; i < 4; i++){
            Livros l = new Livros(i, 2000 + i, "Gabriel Livro " + i, "Autor desconhecido " + i);
            livros.add(l);
        }
    }

    @GetMapping("/")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
     public ArrayList<Livros> getLivros() {

        return livros;
    }

}