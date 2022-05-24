package ch.bzz.Projekt_M133.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class Zutat {
    // declare attributes
    @JsonIgnore
    private Gericht gericht;

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

