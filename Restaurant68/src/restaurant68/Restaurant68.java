/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant68;

import java.sql.Connection;
import restaurant68.AccesoADatos.Conexion;
import restaurant68.AccesoADatos.ProductoData;
import restaurant68.Entidades.Producto;

/**
 *
 * @author Fran-PC
 */
public class Restaurant68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        ProductoData productoData= new ProductoData();
        Producto producto = new Producto(1,"Coca-Cola","Bebida sin alcohol",30, 500,true );
        
      //  productoData.agregarProducto(producto);
     // productoData.modificarProducto(producto);
     productoData.eliminarProducto(1);
    }
    
}
