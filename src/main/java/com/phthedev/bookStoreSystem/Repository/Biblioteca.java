package com.phthedev.bookStoreSystem.Repository;

import com.phthedev.bookStoreSystem.Model.Autor;
import com.phthedev.bookStoreSystem.Model.Livro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;

    public Biblioteca(List<Livro> livros, List<Autor> autores) {
        this.livros = new ArrayList<>();
        this.autores =  new ArrayList<>();

        Autor autor1 = new Autor(UUID.randomUUID(), "Thomas H. Cormen", LocalDate.of(1956, 1, 1)); // data fictícia
        Autor autor2 = new Autor(UUID.randomUUID(), "Aditya Y. Bhargava", LocalDate.of(1985, 1, 1)); // data fictícia
        Autor autor3 = new Autor(UUID.randomUUID(), "Robert C. Martin", LocalDate.of(1952, 12, 5)); // data aproximada


        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);


        livros.add(new Livro(UUID.randomUUID(), "Algoritmos – Teoria e Prática", autor1, true, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(UUID.randomUUID(), "Entendendo Algoritmos – Um Guia Ilustrado Para Programadores e Outros Curiosos", autor2, false, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(UUID.randomUUID(), "Arquitetura Limpa – O Guia do Artesão para Estrutura e Design de Software", autor3, false, LocalDateTime.now(), LocalDateTime.now()));
        livros.add(new Livro(UUID.randomUUID(), "Código Limpo – Habilidades práticas do Agile Software", autor1, true, LocalDateTime.now(), LocalDateTime.now()));
    }
    public List<Livro> getLivros() {
        return livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }
}
