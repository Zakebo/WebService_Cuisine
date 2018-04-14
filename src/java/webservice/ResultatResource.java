/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import travail.*;
import java.sql.*;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author C103-image
 */
@Path("resultat")
public class ResultatResource {
    Connection conn;
    Statement stmt = null;
    
    @Context
    private UriInfo context;

    @GET
    @Path("LesRecettes")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Recette> getRecettes()
    {
        ArrayList<Recette> lesResultats = GestionCuisine.ListeRecettes();
        return lesResultats;
    }
    
    @GET
    @Path("lesIngredients")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Ingredient> getIngredients(@QueryParam("id") int pNom)
    {
        ArrayList<Ingredient> lesResultats = GestionCuisine.ingredientsRecette(pNom);
        return lesResultats;
    }
    
    @GET
    @Path("lesEtapes")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Etape> getEtapes(@QueryParam("id") int pNom)
    {
        ArrayList<Etape> lesResultats = GestionCuisine.EtapesRecette(pNom);
        return lesResultats;
    }
}
