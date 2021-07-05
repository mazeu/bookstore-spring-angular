package com.mazeu.bookstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String titulo;

    private String nameAutor;

    private String texto;

    @ManyToOne
    @Column(name = "categoria_id")
    private Categoria categoria;

    public Livro(Integer id, String titulo, String nameAutor, String texto, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nameAutor = nameAutor;
        this.texto = texto;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
