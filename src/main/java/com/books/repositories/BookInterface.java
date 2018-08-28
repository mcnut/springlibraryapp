package com.books.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.books.models.Book;

public interface BookInterface  extends CrudRepository<Book, Long> {
	
}
