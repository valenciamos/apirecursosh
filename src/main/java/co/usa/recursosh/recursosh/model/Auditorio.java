package co.usa.recursosh.recursosh.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="auditorio")

public class Auditorio implements Serializable { 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numId;
    private String nombreAuditorio;
    private Date fechaCreacionDate;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "auditorio")
    @JsonIgnoreProperties("auditorio")
    private List<Audience> audiences;


    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
    }
    public String getNombreAuditorio() {
        return nombreAuditorio;
    }
    public void setNombreAuditorio(String nombreAuditorio) {
        this.nombreAuditorio = nombreAuditorio;
    }
    public Date getFechaCreacionDate() {
        return fechaCreacionDate;
    }
    public void setFechaCreacionDate(Date fechaCreacionDate) {
        this.fechaCreacionDate = fechaCreacionDate;
    }
    public List<Audience> getAudiences() {
        return audiences;
    }
    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }
    
}
