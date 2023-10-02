/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant68;

import java.sql.Connection;
import restaurant68.AccesoADatos.Conexion;

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
    }
    
}
