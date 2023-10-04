
package restaurant68.Entidades;

public class Pedidos {
    int idPedido;
    Producto producto;
    int cantidad;
    int cuenta;
    Mesero mesero;
    Mesa mesa;
    String anotaciones;

    public Pedidos() {
    }

    public Pedidos(int idPedido, Producto producto, int cantidad, int cuenta, Mesero mesero, Mesa mesa, String anotaciones) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
        this.mesero = mesero;
        this.mesa = mesa;
        this.anotaciones = anotaciones;
    }

    public Pedidos(Producto producto, int cantidad, int cuenta, Mesero mesero, Mesa mesa, String anotaciones) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
        this.mesero = mesero;
        this.mesa = mesa;
        this.anotaciones = anotaciones;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + ", producto=" + producto + ", cantidad=" + cantidad + ", cuenta=" + cuenta + ", mesero=" + mesero + ", mesa=" + mesa + ", anotaciones=" + anotaciones + '}';
    }
    
}
