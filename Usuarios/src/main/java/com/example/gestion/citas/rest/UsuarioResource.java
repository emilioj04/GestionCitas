/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gestion.citas.rest;

/**
 *
 * @author david
 */
import com.example.gestion.citas.model.GestionUsuarios;
import com.example.gestion.citas.model.Persona;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
public class UsuarioResource {
    private final GestionUsuarios gestionUsuarios = new GestionUsuarios();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getUsuarios() {
        return gestionUsuarios.obtenerTodos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona agregarUsuario(Persona persona) {
        return gestionUsuarios.agregarUsuario(persona);
    }
}