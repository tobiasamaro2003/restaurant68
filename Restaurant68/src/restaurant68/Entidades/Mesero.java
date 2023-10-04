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
public class Mesero {
    int idMesero;
    String apellido;
    String nombre; 
    int dni; // ---
    Mesa mesa;
    Pedidos pedido;
    boolean estado;

    public Mesero() {
    }

    public Mesero(int idMesero, String apellido, String nombre, int dni, Mesa mesa, Pedidos pedido, boolean estado) {
        this.idMesero = idMesero;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.mesa = mesa;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesero(String apellido, String nombre, int dni, Mesa mesa, Pedidos pedido, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.mesa = mesa;
        this.pedido = pedido;
        this.estado = estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", mesa=" + mesa + ", pedido=" + pedido + ", estado=" + estado + '}';
    }
    
}
