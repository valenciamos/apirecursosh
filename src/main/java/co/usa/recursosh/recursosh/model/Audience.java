package co.usa.recursosh.recursosh.model;

import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="audience")

public class Audience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numId;
    private String owner;
    private Integer capacity;
    private Integer category_id;
    private String name;

    @ManyToOne
    @JoinColumn(name= "auditorio_id")
    @JsonIgnoreProperties("audiences")
    private Auditorio auditorio;
    


    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Auditorio getAuditorio() {
        return auditorio;
    }
    public void setAuditorio(Auditorio auditorio) {
        this.auditorio = auditorio;
    }
    

        
}
