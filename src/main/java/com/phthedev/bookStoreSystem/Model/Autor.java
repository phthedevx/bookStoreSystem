package com.phthedev.bookStoreSystem.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Autor {
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(UUID id, String nome, LocalDate dataNascimento ) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
