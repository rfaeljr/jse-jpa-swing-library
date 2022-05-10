package br.com.rafaelcosta.library.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 *
 * @author rafaelcosta
 */
//Author is an entity that relationship with entity Book of type N to N 
//that is Authors can writers multiples Books and Book can have multiples Authors 
@Entity
public class Author implements Serializable {
    //Entity will have a primary key of type auto incremment
    //All atributes are of type Wrapper for facility in populate values
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentNumber;
    private String name;
    private String lastname;
    //Anottation One to Many describe the multiplicity of the relationship
    @OneToMany(mappedBy = "author")
    List<AuthorBook> listOfBooks;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<AuthorBook> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<AuthorBook> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    
    
    
}
