/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.service.impl;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.dao.AffectationDao;
import com.poussin.Firme.service.AffectationService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elitebook folio
 */
@Service
public class AffectationServiceImpl implements AffectationService {

    @Autowired
    private AffectationDao affectationDao;

    /*  @Override
    public List<Affectation> findByFirme(Firme firme) {
        return affectationDao.findByFirme(firme);
    }  */

        @Override
    public List<Affectation> findByFirme(String reference) {
        return affectationDao.findByFirmeReference(reference);
    }
    
   /*  @Override
    public Affectation findAffectationByFirme(String reference) {
        return affectationDao.findAffectationByFirme(reference);   
    }   */

    @Override
    public int creer(Affectation affectation) {
        affectation.setDateAffectation(new Date());
        affectationDao.save(affectation);
        return 1;
    }

    public void saveAffectation(Firme firme) {
        List<Affectation> affectations = firme.getAffectations();
        if (affectations != null && !affectations.isEmpty()) {
            for (Affectation affectation : affectations) {
                affectation.setFirme(firme);
                creer(affectation);
            }
        }
    }

    public AffectationDao getAffectationDao() {
        return affectationDao;
    }

    public void setAffectationDao(AffectationDao affectationDao) {
        this.affectationDao = affectationDao;
    }



}
