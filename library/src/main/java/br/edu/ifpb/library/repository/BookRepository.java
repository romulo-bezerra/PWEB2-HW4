package br.edu.ifpb.library.repository;

import br.edu.ifpb.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
