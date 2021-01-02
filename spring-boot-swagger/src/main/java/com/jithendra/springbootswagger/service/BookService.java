package com.jithendra.springbootswagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jithendra.springbootswagger.dao.BookRepository;
import com.jithendra.springbootswagger.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public String saveBook(Book book)
	{
		 repository.save(book);
		 return "Book saved with id "+book.getBookId();
	}

	public Book getBook(int bookId)
	{
		return repository.findById(bookId).orElse(null);
	}
	
	public List<Book> removeBook(int bookId)
	{
		repository.deleteById((bookId));
		return repository.findAll();
		
	}
}

