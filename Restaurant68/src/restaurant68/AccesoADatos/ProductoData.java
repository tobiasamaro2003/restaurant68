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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        String sql = "INSERT INTO producto (Nombre, TipoProducto, Stock, Precio, Estado)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getTipoDeProducto());
            ps.setInt(3, producto.getStock());
            ps.setFloat(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());

            List<Producto> listaProductos = new ArrayList<>();
            listaProductos = this.listarProductos();

            boolean bandera = false;
            for (Producto listaProducto : listaProductos) {
                if (producto.getNombre().equals(listaProducto.getNombre())) {//comparo el nombre que agregamos y el nombre de mi lista
                    bandera = true;
                }
            }

            if (!bandera) {
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El prodcuto agregado ya existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto." + ex.getMessage());

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
            ps.setInt(6, producto.getIdProducto());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            }

        } catch (SQLException ex) {
            //Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

        }
    }

    public List<Producto> listarProductos() {
        List<Producto> productoList = new ArrayList<>();

        String sql = "SELECT * FROM producto";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setTipoDeProducto(rs.getString("tipoProducto"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setEstado(rs.getBoolean("estado"));
                productoList.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla" + ex.getMessage());
        }

        return productoList;
    }

    public static Comparator<Producto> comparaNombre = new Comparator<Producto>() { //SUBCLASE. Lo que está entre <> es el tipo.
        @Override
        public int compare(Producto p1, Producto p2) {
            return p1.getNombre().compareTo(p2.getNombre()); //compara el nmbre de un producto con el otro.
        }
    };

}
