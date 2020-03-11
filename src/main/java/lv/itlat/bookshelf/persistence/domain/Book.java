package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity(name = "Book")
@Table(name = "BOOK")
public class Book implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="Title should not be empty")
    @Column(name = "TITLE", length = 200, nullable = false)
    @Size(max=200)
    private String title;

    @NotEmpty
    @Column(name = "AUTHOR", length = 200, nullable = false)
    @Size(max=200)
    private String author;

    @NotEmpty
    @Size(min=10, max=50)
    @Column(name = "ISBN",length=50, nullable = false, unique = true)
    private String isbn;

    @Column(name = "DESCRIPTION",length=1000)
    @Size(max=1000)
    private String description;

    @NotEmpty
    @Column(name = "YEAR", nullable = false)
    @NotNull
    @Min(value=1)
    private int year;

    public Book() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


