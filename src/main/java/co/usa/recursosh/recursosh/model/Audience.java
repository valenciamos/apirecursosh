package co.usa.recursosh.recursosh.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="audience")

public class Audience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numId;
    private String name;
    private String owner;
    private Integer capacity;
    private Integer category_id;
    private String description;

    @ManyToOne
    @JoinColumn(name= "category_id")
    @JsonIgnoreProperties("audiences")
    private Categoria category;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   // public Categoria getCategory() {
       // return category;
   // }

    //public void setCategory(Categoria category) {
    //    this.category = category;
  //  }

     
    
    
    

        
}
