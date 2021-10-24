package co.usa.recursosh.recursosh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursosh.recursosh.model.Auditorio;
import co.usa.recursosh.recursosh.repository.AuditorioRepositorio;

@Service
public class AuditorioServicio {
    @Autowired
    AuditorioRepositorio auditorioRepositorio;

    public List<Auditorio>getAll(){
        return auditorioRepositorio.getAll();
                
    }

    public Optional<Auditorio>getAuditorio(int id){
        return auditorioRepositorio.getAuditorio(id);
                
    }

    public Auditorio save(Auditorio aud){
        // verificar si el id es nulo

        if (aud.getNumId()==null){
            return auditorioRepositorio.save(aud);
        }else{// verifico si existe o no el id en la base de datos
            Optional<Auditorio> consulta=auditorioRepositorio.getAuditorio(aud.getNumId());

            if(consulta.isEmpty()){
                return auditorioRepositorio.save(aud);
            
            }else{
                return aud;
            }
        }
    }
}


    

