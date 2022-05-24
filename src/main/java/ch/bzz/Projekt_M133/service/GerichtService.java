package ch.bzz.Projekt_M133.service;


import ch.bzz.Projekt_M133.data.DataHandler;
import ch.bzz.Projekt_M133.model.Gericht;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.List;

import static javax.ws.rs.core.Response.status;
import static javax.xml.ws.Response.*;

@Path("gericht")
public class GerichtService {
    /**
     *
     * @return
     */

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listBooks(){
        List<Gericht> recipeList = DataHandler.getInstance().readAllRecipes();
        return Response
                .status(200)
                .entity(recipeList)
                .build();
    }

    @GET
    @Path("read")
    @Produces(MediaType.APPLICATION_JSON)
    public Response readRecipe(
            @QueryParam("recipeNumber") String recipeNumber
    ) {
        Gericht recipe = DataHandler.getInstance().readRecipeByRecipeNumber(recipeNumber);
        return Response
                .status(200)
                .entity(recipe)
                .build();
    }
}

