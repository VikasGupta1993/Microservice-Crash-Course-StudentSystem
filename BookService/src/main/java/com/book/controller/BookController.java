package com.book.controller;

import com.book.entity.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/insert")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }
}
