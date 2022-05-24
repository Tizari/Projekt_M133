package ch.bzz.Projekt_M133.data;


import ch.bzz.Projekt_M133.model.*;
import ch.bzz.Projekt_M133.service.Config;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.awt.print.Book;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * reads and writes the data in the JSON-files
 */
public class DataHandler {
    private static DataHandler instance = null;
    private List<Zutat> ingredientList;
    private List<Gericht> recipeList;

    /**
     * private constructor defeats instantiation
     */
    private DataHandler() {
        setRecipeList(new ArrayList<>());
        readRecipeJSON();
        setIngredientList(new ArrayList<>());
        readIngredientJSON();
    }

    /**
     * gets the only instance of this class
     * @return
     */
    public static DataHandler getInstance() {
        if (instance == null)
            instance = new DataHandler();
        return instance;
    }


    /**
     * reads all books
     * @return list of books
     */
    public List<Zutat> readAllIngredients() {
        return getIngredientList();
    }

    /**
     * reads a book by its name
     * @param bezeichnung
     * @return the Ingredient (null=not found)
     */
    public Zutat readIngredientByName(String bezeichnung) {
        Zutat ingredient = null;
        for (Zutat entry : getIngredientList()) {
            if (entry.getBezeichnung().equals(bezeichnung)) {
                ingredient = entry;
            }
        }
        return ingredient;
    }

    /**
     * reads all Publishers
     * @return list of publishers
     */
    public List<Gericht> readAllRecipes() {

        return getRecipeList();
    }

    /**
     * reads a publisher by its uuid
     * @param recipeNumber
     * @return the Publisher (null=not found)
     */
    public Gericht readRecipeByRecipeNumber(String recipeNumber) {
        Gericht recipe = null;
        for (Gericht entry : getRecipeList()) {
            if (entry.getRecipeNumber().equals(recipeNumber)) {
                recipe = entry;
            }
        }
        return recipe;
    }

    /**
     * reads the books from the JSON-file
     */
    private void readIngredientJSON() {
        try {
            String path = Config.getProperty("zutatJSON");
            byte[] jsonData = Files.readAllBytes(
                    Paths.get(path)
            );
            ObjectMapper objectMapper = new ObjectMapper();
            Zutat[] zutaten = objectMapper.readValue(jsonData, Zutat[].class);
            for (Zutat zutat : zutaten) {
                getIngredientList().add(zutat);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * reads the publishers from the JSON-file
     */
    private void readRecipeJSON() {
        try {
            byte[] jsonData = Files.readAllBytes(
                    Paths.get(
                            Config.getProperty("gerichtJSON")
                    )
            );
            ObjectMapper objectMapper = new ObjectMapper();
            Gericht[] gerichte = objectMapper.readValue(jsonData, Gericht[].class);
            for (Gericht gericht : gerichte) {
                getRecipeList().add(gericht);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * gets ingredientList
     *
     * @return value of bookList
     */
    private List<Zutat> getIngredientList() {
        return ingredientList;
    }

    /**
     * sets bookList
     *
     * @param ingredientList the value to set
     */
    private void setIngredientList(List<Zutat> ingredientList) {
        this.ingredientList = ingredientList;
    }

    /**
     * gets publisherList
     *
     * @return value of publisherList
     */
    private List<Gericht> getRecipeList() {
        return recipeList;
    }

    /**
     * sets publisherList
     *
     * @param recipeList the value to set
     */
    private void setRecipeList(List<Gericht> recipeList) {
        this.recipeList = recipeList;
    }


}