package com.jithendra.springbootswagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jithendra.springbootswagger.model.Book;
import com.jithendra.springbootswagger.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
@Api(value="Book Service", description="My Book Store")
public class BookController {
	
	@Autowired
	private BookService service;
	@PostMapping("/save")
	@ApiOperation(value="store book api")
	public String saveBook(@RequestBody Book book)
	{
		return service.saveBook(book);
	}
	@GetMapping("/searchbook/{bookId}")
	@ApiOperation(value="search book api")
	public Book getBook(@PathVariable int bookId)
	{
		Book b=service.getBook(bookId);
		System.out.println(b.getBookName());
		return b;
	}
	@DeleteMapping("/deletebook/{bookId}")
	@ApiOperation(value="delete book api")
	public List<Book> removeBook(@PathVariable int bookId)
	{
		return service.removeBook(bookId);
	}
	

}
