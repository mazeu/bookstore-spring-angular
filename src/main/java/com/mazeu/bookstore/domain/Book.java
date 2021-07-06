package com.mazeu.bookstore.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String nameAutor;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;

    public Book(){
        super();
    }

    public Book(Integer id, String titulo, String nameAutor, String texto, Categoria categoria) {
        super();
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
