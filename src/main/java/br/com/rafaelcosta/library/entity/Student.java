package br.com.rafaelcosta.library.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author rafaelcosta
 */
@Entity
public class Student implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String name;
    private String lastname;
    private String bornIn;
    private Byte statusToLibrary;
    private String address;


    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBornIn() {
        return bornIn;
    }

    public void setBornIn(String bornIn) {
        this.bornIn = bornIn;
    }

    public Byte getStatusToLibrary() {
        return statusToLibrary;
    }

    public void setStatusToLibrary(Byte statusToLibrary) {
        this.statusToLibrary = statusToLibrary;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
}
