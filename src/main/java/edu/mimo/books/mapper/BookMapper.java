package edu.mimo.books.mapper;

import org.springframework.stereotype.Component;

import edu.mimo.books.dto.BookCreationDto;
import edu.mimo.books.dto.BookDto;
import edu.mimo.books.entity.Book;

@Component
public class BookMapper {
    public Book toEntity(BookCreationDto dto) {
        Book book = new Book();
        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setOriginalLanguage(dto.getOriginalLanguage());
        book.setYear(dto.getYear());
        return book;
    }

    public BookDto toDto(Book book) {
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setIsbn(book.getIsbn());
        dto.setTitle(book.getTitle());
        dto.setOriginalLanguage(book.getOriginalLanguage());
        dto.setYear(book.getYear());
        return dto;
    }
} 