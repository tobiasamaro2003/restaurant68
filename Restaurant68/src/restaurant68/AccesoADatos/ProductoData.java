/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant68.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurant68.Entidades.Producto;

/**
 *
 * @author Fran-PC
 */
public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre, tipoProducto, stock, precio, estado)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getTipoDeProducto());
            ps.setInt(3, producto.getStock());
            ps.setFloat(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto."+ ex.getMessage());

        }

    }

    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado=0 WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }

    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, tipoProducto=?, stock=?, precio=?, estado=? WHERE IdProducto=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getTipoDeProducto());
            ps.setInt(3, producto.getStock());
            ps.setFloat(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdPedido());
            
            int exito= ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto"+ ex.getMessage());

        }
    }
}
