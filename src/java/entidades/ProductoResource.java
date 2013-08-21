/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


/**
 *
 * @author Julio
 */
@Stateless
@Path("/productos")
public class ProductoResource {
    @GET
    public String getProductos(){
        return "asd";
    }
    @GET
    @Path("{id}")
    public Response getProducto(@PathParam("id")String id){
        return Response.status(200).entity("Producto "+id).build();
    }
}
