package co.usa.recursosh.recursosh.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="category")

public class Categoria implements Serializable { 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numId;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Audience> audiences;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Audience> getAudiences() {
         return audiences;
    }

    public void setAudiences(List<Audience> audiences) {
       this.audiences = audiences;
    }
    

    
 }

    

   