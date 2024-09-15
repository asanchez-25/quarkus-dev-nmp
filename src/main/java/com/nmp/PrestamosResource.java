package com.nmp;

import jakarta.ws.rs.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
@Path("/prestamo")

public class PrestamosResource {
    private PrestamoService prestamo;


    @Inject
    public PrestamosResource(PrestamoService prestamo) {
        this.prestamo = prestamo;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prestamo> list() {
        return prestamo.obtenerArticulo();

    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/preautorizado")
    public PrestamoOfertado obtenerPrestamo(Prestamo p){

        return prestamo.obtenerPrestamo(p);

    }



    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public  Prestamo RegistoArticulos(Prestamo temp){
        prestamo.addArticulo(temp);
        return temp;
    }





}
