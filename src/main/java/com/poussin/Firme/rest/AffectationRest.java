/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.rest.converter.AbstractConverter;
import com.poussin.Firme.rest.vo.AffectationVo;
import com.poussin.Firme.rest.vo.FirmeVo;
import com.poussin.Firme.service.AffectationService;
import java.util.List;
import static net.bytebuddy.implementation.FixedValue.reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elitebook folio
 */
@RestController()
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping({"/firme-api/affectations"})
public class AffectationRest {

    @Autowired
    private AffectationService affectationService;

    @Autowired
    @Qualifier("firmeConverter")
    private AbstractConverter<Firme, FirmeVo> firmeConverter;

    /*   @GetMapping("/")
    public List<AffectationVo> findByFirme(FirmeVo firmeVo) {
        final List<Affectation> affectations = affectationService.findByFirme(firmeConverter.toItem(firmeVo));
        return affectationConverter.toVo(affectations);
    }
     */
    public AffectationService getAffectationService() {
        return affectationService;
    }

    public void setAffectationService(AffectationService affectationService) {
        this.affectationService = affectationService;
    }

    public AbstractConverter<Firme, FirmeVo> getFirmeConverter() {
        return firmeConverter;
    }

    public void setFirmeConverter(AbstractConverter<Firme, FirmeVo> firmeConverter) {
        this.firmeConverter = firmeConverter;
    }

}
