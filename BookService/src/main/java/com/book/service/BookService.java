package com.book.service;

import com.book.entity.Book;
import com.book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public Book createBook(Book book){
        return bookRepo.save(book);
    }

    public Book getBookById(int id){
        return bookRepo.findById(id).get();
    }
}
