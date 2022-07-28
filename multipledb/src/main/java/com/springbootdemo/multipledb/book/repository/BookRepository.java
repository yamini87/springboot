package com.springbootdemo.multipledb.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipledb.model.book.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
