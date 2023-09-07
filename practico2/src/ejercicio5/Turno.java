package ejercicio5;

import java.time.LocalDateTime;

public class Turno {
    private Cliente cliente;
    private Peluquero peluquero;
    private LocalDateTime hora;

    public Turno(Cliente cliente, Peluquero peluquero, LocalDateTime hora){
        this.cliente = cliente;
        this.peluquero = peluquero;
        this.hora = hora;
    }

    //getters
    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }
    
}
