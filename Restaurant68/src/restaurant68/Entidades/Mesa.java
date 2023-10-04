package restaurant68.Entidades;

public class Mesa {

    int idMesa;

    int capacidad; ///-
    Reserva reserva;
    Mesero mesero;
    boolean estado;

    public Mesa() {
    }

    public Mesa(int idMesa, int capacidad, Reserva reserva, Mesero mesero, boolean estado) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.reserva = reserva;
        this.mesero = mesero;
        this.estado = estado;
    }

    public Mesa(int capacidad, Reserva reserva, Mesero mesero, boolean estado) {
        this.capacidad = capacidad;
        this.reserva = reserva;
        this.mesero = mesero;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", capacidad=" + capacidad + ", reserva=" + reserva + ", mesero=" + mesero + ", estado=" + estado + '}';
    }

    

}
