package restaurant68.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {

    int idReserva;
    String apellido;
    String nombre;
    int dni;
    LocalDateTime horario;
    boolean estado;

    public Reserva(String apellido, String nombre, int dni, LocalDateTime horario, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.horario = horario;
        this.estado = estado;
    }

    public Reserva(int idReserva, String apellido, String nombre, int dni, LocalDateTime horario, boolean estado) {
        this.idReserva = idReserva;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.horario = horario;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", horario=" + horario + ", estado=" + estado + '}';
    }

}
