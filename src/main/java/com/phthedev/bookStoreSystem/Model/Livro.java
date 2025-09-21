package com.phthedev.bookStoreSystem.Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Livro {
    private UUID id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

    public Livro(UUID id, String titulo, Autor autor, boolean disponivel, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
        this.id = id;
        this.disponivel = disponivel;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
