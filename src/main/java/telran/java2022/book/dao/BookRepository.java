package telran.java2022.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.java2022.book.model.Book;
import telran.java2022.book.model.Publisher;

public interface BookRepository {

    boolean existsById(String isbn);

    Book save(Book book);

    Optional<Book> findById(String isbn);

    void delete(Book book);
//
    Stream<Book> findBooksByAuthorsName(String author);
    
    void deleteById(String isbn);
//
    Stream<Book> findByPublisherPublisherName(String publisher);


//    Stream<Author> findBookAuthors(String isbn);

//    List<String> findPublishersByAuthors(String authorName);

}
