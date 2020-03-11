package lv.itlat.bookshelf.persistence.repository;

import lv.itlat.bookshelf.persistence.domain.Book;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
@Transactional
public class BookRepository {

    @PersistenceContext(unitName = "bookshelfPU")
    private EntityManager em;

    public EntityManager getEntityManager(){return em;}

    @Transactional
    public Book create(Book book){
        getEntityManager().persist(book);
        return book;
    }

    public List<Book> retrieve(){
        return getEntityManager().createQuery("SELECT b FROM Person b", Book.class).getResultList();

    }

}
