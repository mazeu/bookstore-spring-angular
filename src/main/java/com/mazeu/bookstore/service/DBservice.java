package com.mazeu.bookstore.service;

import com.mazeu.bookstore.domain.Book;
import com.mazeu.bookstore.domain.Categoria;
import com.mazeu.bookstore.repositories.CategoriaRepository;
import com.mazeu.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBservice {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informatica", "livro de TI");
        Categoria cat2 = new Categoria(null, "Biografia", "livro sobre a vida de alguem");
        Categoria cat3 = new Categoria(null, "Matematica", "livro de matematica");

        Book l1 = new Book(null, "1984","George Orwell","lorem ipsum",cat1);
        Book l2 = new Book(null, "Silvio Santos","Silvio Santos","A vida de Silvio Santos",cat2);
        Book l3 = new Book(null, "Math 123","Marcelo Mendes","Aprenda sobre calculo do basico ao avançado",cat3);

        cat1.getLivros().addAll(Arrays.asList(l1));
        cat2.getLivros().addAll(Arrays.asList(l3,l2));

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        livroRepository.saveAll(Arrays.asList(l1,l2,l3));
    }
}
