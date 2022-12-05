package telran.java2022.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import telran.java2022.book.model.Publisher;

public interface PublisherRepository{

   Optional<Publisher> findById(String publisher);
//    @Query("select distinct p.publisherName from Book b join b.authors a join b.publisher  p where a.name=?1")
    List<String> findPublishersByAuthor(String authorName);
//    
    Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);
   
    Publisher save(Publisher publisher);
}
