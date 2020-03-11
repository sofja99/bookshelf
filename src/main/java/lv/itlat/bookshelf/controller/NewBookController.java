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
public class NewBookController implements Serializable {
    private static final Logger logger=Logger.getLogger(NewBookController.class);

    @Inject
    private BookRepository bookRepository;

    private Book book=new Book();

    public String createBook(){
        bookRepository.create(book);
        book=new Book();
        return "book-created.xhtml";
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
