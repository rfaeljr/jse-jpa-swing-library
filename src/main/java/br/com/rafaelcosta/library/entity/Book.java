package br.com.rafaelcosta.library.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author rafaelcosta
 */
@Entity
public class Book implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String title;
    @Transient
    private Long quantityBook;
    @OneToMany(mappedBy = "book")
    List<AuthorBook> listOfAuthors;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public Long getQuantityBook() {
        return quantityBook;
    }

    public void setQuantityBook(Long quantityBook) {
        this.quantityBook = quantityBook;
    }   

    public List<AuthorBook> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<AuthorBook> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    
}
