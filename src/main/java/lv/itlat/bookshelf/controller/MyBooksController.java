package lv.itlat.bookshelf.controller;

import lv.itlat.bookshelf.persistence.domain.Book;
import lv.itlat.bookshelf.persistence.repository.BookRepository;
import org.apache.log4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class MyBooksController implements Serializable {
    private static final Logger logger=Logger.getLogger(MyBooksController.class);

    @Inject
    private BookRepository bookRepository;

    private List <Book> books;

    public String prepare(){
        books=bookRepository.retrieve();
        return "my-books.xhtml";
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
