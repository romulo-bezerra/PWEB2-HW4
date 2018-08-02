package br.edu.ifpb.library.web;

import br.edu.ifpb.library.domain.Book;
import br.edu.ifpb.library.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getTodos() {
        return ResponseEntity.ok().body(bookService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Book> postProduto(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookService.salvarBook(book));
    }

}
