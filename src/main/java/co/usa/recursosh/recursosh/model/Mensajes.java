package co.usa.recursosh.recursosh.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="messages")

public class Mensajes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String emailmessagetext;



    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getEmailmessagetext() {
        return emailmessagetext;
    }
    public void setEmailmessagetext(String emailmessagetext) {
        this.emailmessagetext = emailmessagetext;
    }   

    
}
