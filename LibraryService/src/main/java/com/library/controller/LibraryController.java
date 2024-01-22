package com.library.controller;

import com.library.entity.Book;
import com.library.entity.Library;
import com.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/insert")
    public Library insertLibrary(@RequestBody Library library){
        return libraryService.insertLibrary(library);
    }

    @GetMapping("{id}")
    public Library getLibrary(@PathVariable int id){

        Book book = restTemplate.getForObject("http://localhost:9094/book/"+id,Book.class);

        Library library = libraryService.getLibrary(id);
        library.setBook(book);
        return library;
    }
}
