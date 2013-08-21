/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Alexander
 */
@Stateless
@Path("/productos")
public class productos {
    ArrayList<producto> productos = new ArrayList<producto>();
    int secuencia = 1;
    
    @GET
    public String listarProductos() {
        if (this.productos.isEmpty()) {
            return "{}";
        } else {
            Gson objetogson = new Gson();
            return objetogson.toJson(productos.toArray());
        }
    }
    
    
}

class producto{
    int id;
    double costo;
    String nombre;
    String Descripcion;
    
    public producto(int id, double costo, String nombre, String Descripcion) {
        this.id = id;
        this.costo = costo;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
    }
    
}
