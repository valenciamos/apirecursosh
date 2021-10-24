package co.usa.recursosh.recursosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursosh.recursosh.model.Auditorio;
import co.usa.recursosh.recursosh.repository.crud.AuditorioCrudRepositorio;
@Repository
public class AuditorioRepositorio {

   @Autowired
   AuditorioCrudRepositorio auditorioCrudRepositorio;

   public List <Auditorio>getAll(){
    return (List<Auditorio>)auditorioCrudRepositorio.findAll();
        
   }

   public Optional<Auditorio>getAuditorio(int id){
       return auditorioCrudRepositorio.findById(id);
       
   }

   public Auditorio save(Auditorio aud){
    return auditorioCrudRepositorio.save(aud);

   }
   

    
}
