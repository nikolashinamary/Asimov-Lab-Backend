package com.example.demo.repo;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {
    public List<Book> getBooksBySubject(String subject);
    public Book getBookByHeading(String heading);
}
