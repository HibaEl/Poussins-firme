/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.dao;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elitebook folio
 */
@Repository
public interface AffectationDao extends JpaRepository<Affectation, Long>{
    
     public List<Affectation> findByFirme(Firme firme);
     
     public List<Affectation> findByFirmeReference(String reference);
     
    /*  @Query("select a from Affectation a where a.firme.reference = :reference")
    public Affectation findAffectationByFirme(@Param("reference") String reference);   */
    
}
