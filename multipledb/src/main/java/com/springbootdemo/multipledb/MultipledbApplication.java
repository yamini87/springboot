package com.springbootdemo.multipledb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.multipledb.book.repository.BookRepository;
import com.springbootdemo.multipledb.customer.repository.CustomerRepository;
import com.springbootdemo.multipledb.model.book.Book;
import com.springbootdemo.multipledb.model.customer.Customer;

@SpringBootApplication
@RestController
@RequestMapping("/db")
public class MultipledbApplication {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	
	
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MultipledbApplication.class, args);
	}

	
}