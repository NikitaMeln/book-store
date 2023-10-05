package book.store.service;

import book.store.models.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
