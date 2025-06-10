package edu.mimo.books.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import edu.mimo.books.dto.BookCreationDto;
import edu.mimo.books.dto.BookDto;

public interface BookService {
    List<BookDto> getAllBooks();
    Optional<BookDto> getBookById(Long id);
    BookDto createBook(BookCreationDto bookCreateDto);
    Optional<BookDto> updateBook(Long id, BookCreationDto bookCreateDto);
    boolean deleteBook(Long id);
    Map<String, List<BookDto>> groupBooksByLanguage();
} 