package ejercicio4;

import java.time.LocalDateTime;

public class Turno {
    private Usuario usuario;
    private Cancha cancha;
    private LocalDateTime horaInicio;
    private int duracion; // esto es en hora

    public Turno(Usuario usuario, Cancha cancha, LocalDateTime horaInicio, int duracion){
        this.usuario = usuario;
        this.cancha = cancha;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
    }

    public double calcularCosto(){
        double costoTotal = this.cancha.getCostoHora() * this.duracion;
        if(this.usuario.esSocio()){
            costoTotal -= costoTotal * 0.10;
        }
        return costoTotal;
    }

    //getters
    public Cancha getCancha() {
        return cancha;
    }

    public int getDuracion() {
        return duracion;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    //setters
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
