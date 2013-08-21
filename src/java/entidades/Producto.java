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


/**
 *
 * @author Julio
 */
@Stateless
@Path("/productos")
public class Producto {
    @GET
    public String getProductos(){
        return "asd";
    }
    @GET
    public String getProducto(@PathParam("id")String id){
        return null;
    }
}
