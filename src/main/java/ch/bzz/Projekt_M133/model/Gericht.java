package ch.bzz.Projekt_M133.model;

import java.util.ArrayList;
import java.util.List;

public class Gericht {
    // declare attributes
    private String recipeNumber;

    private String bezeichung;
    private List<Zutat> zutaten;
    private String beschreibung;
    private String ursprungsLand;
    private Integer fuerAnzPersonen;


    public Gericht(String recipeNumber, String bezeichung, List<Zutat> zutaten, String beschreibung, String ursprungsLand, Integer fuerAnzPersonen) {
        this.recipeNumber = recipeNumber;
        this.bezeichung = bezeichung;
        this.zutaten = new ArrayList<>();
        this.beschreibung = beschreibung;
        this.ursprungsLand = ursprungsLand;
        this.fuerAnzPersonen = fuerAnzPersonen;
    }

    /**
     * constructor: initialize attributes
     */


    public String getRecipeNumber() {
        return recipeNumber;
    }

    public void setRecipeNumber(String recipeNumber) {
        this.recipeNumber = recipeNumber;
    }

    public String getBezeichung() {
        return bezeichung;
    }

    public void setBezeichung(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public List<Zutat> getZutaten() {
        return zutaten;
    }

    public void setZutaten(List<Zutat> zutaten) {
        this.zutaten = zutaten;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getUrsprungsLand() {
        return ursprungsLand;
    }

    public void setUrsprungsLand(String ursprungsLand) {
        this.ursprungsLand = ursprungsLand;
    }

    public Integer getFuerAnzPersonen() {
        return fuerAnzPersonen;
    }

    public void setFuerAnzPersonen(Integer fuerAnzPersonen) {
        this.fuerAnzPersonen = fuerAnzPersonen;
    }
}

