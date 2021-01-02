package com.jithendra.springbootswagger.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jithendra.springbootswagger.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
