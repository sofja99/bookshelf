package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="User")
@Table(name="USER")
public class User implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
