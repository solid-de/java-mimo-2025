package edu.mimo.books.repository;

import edu.mimo.books.entity.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @EntityGraph(attributePaths = {"author"})
    Optional<Book> findById(Long id);



} 