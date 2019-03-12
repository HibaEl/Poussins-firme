/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.service;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elitebook folio
 */
@Service
public interface AffectationService {

    public List<Affectation> findByFirme(String reference);

    public int creer(Affectation affectation);

    public void saveAffectation(Firme firme);
    
   // public List<Affectation> findByFirmeReference(String reference);
    
    //public Affectation findAffectationByFirme(String reference);

}
