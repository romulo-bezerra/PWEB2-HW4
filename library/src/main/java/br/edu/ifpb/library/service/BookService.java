package br.edu.ifpb.library.service;

import br.edu.ifpb.library.domain.Book;
import br.edu.ifpb.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> listarTodos() {
        return bookRepository.findAll();
    }

    public Book salvarBook(Book book) {
        return bookRepository.save(book);
    }

}
