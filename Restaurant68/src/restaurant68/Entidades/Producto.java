/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant68.Entidades;

/**
 *
 * @author Fran-PC
 */
public class Producto {

    int idPedido;
    String tipoDeProducto;
    String nombre;
    int Stock;
    int precio;
    boolean estado;

    public Producto() {
    }

    public Producto(int idPedido, String nombre, String tipoDeProducto, int Stock, int precio, boolean estado) {
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.tipoDeProducto = tipoDeProducto;

        this.Stock = Stock;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto(String nombre, String tipoDeProducto, int Stock, int precio, boolean estado) {
        this.nombre = nombre;
        this.tipoDeProducto = tipoDeProducto;

        this.Stock = Stock;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idPedido=" + idPedido + ", tipoDeProducto=" + tipoDeProducto + ", nombre=" + nombre + ", Stock=" + Stock + ", precio=" + precio + ", estado=" + estado + '}';
    }

}
