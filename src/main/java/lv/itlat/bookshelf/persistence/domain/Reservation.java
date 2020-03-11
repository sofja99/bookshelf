package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Reservation")
@Table(name="RESERVATION")
public class Reservation implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Reservation(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
