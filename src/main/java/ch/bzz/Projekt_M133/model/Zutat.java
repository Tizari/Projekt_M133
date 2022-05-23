package ch.bzz.Projekt_M133.model;

import java.math.BigDecimal;

public class Zutat {
    // declare attributes
    private String bezeichnung;
    private BigDecimal mengeInGramm;

    /**
     * constructor: initialize attributes
     */
    public Zutat() {

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public BigDecimal getMengeInGramm() {
        return mengeInGramm;
    }

    public void setMengeInGramm(BigDecimal mengeInGramm) {
        this.mengeInGramm = mengeInGramm;
    }
}

