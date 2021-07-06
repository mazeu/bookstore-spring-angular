package com.mazeu.bookstore;

import com.mazeu.bookstore.domain.Categoria;
import com.mazeu.bookstore.domain.Book;
import com.mazeu.bookstore.repositories.CategoriaRepository;
import com.mazeu.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	@Override
	public void run(String... args) throws Exception{
		Categoria cat1 = new Categoria(null, "Informatica", "livro de TI");

		Book l1 = new Book(null, "1984","George Orwell","lorem ipsum",cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));

	}
}
