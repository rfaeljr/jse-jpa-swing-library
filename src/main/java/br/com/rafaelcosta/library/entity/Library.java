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
@Entity
public class Library implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; 
    private String address;
    private String phoneNumber;
    @OneToMany(mappedBy = "library")
    private List<SectionLib> listOfSectionLib;

    public Library() {
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

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<SectionLib> getListOfSectionLib() {
        return listOfSectionLib;
    }

    public void setListOfSectionLib(List<SectionLib> listOfSectionLib) {
        this.listOfSectionLib = listOfSectionLib;
    }

}
