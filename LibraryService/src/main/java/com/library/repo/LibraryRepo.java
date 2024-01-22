package com.library.repo;

import com.library.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library,Integer> {
}
