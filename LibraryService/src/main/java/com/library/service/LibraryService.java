package com.library.service;

import com.library.entity.Library;
import com.library.repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepo libraryRepo;

    public Library insertLibrary(Library library){
        return libraryRepo.save(library);
    }

    public Library getLibrary(int id){
        return libraryRepo.findById(id).get();
    }
}
