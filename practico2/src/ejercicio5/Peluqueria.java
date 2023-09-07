package ejercicio5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Peluqueria {
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Turno> turnos;

    public Peluqueria(){
        this.peluqueros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void agregarPeluquero(Peluquero peluquero){
        this.peluqueros.add(peluquero);
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarTurno(Turno turno){
        this.turnos.add(turno);
    }

    public Turno buscarPrimerTurnoDisponible() {
        for (Turno turno : turnos) {
            if (!existeTurnoEnHora(turno.getHora())) {
                return turno;
            }
        }
        return null; // Si no se encuentra ningún turno disponible
    }

    public Turno buscarPrimerTurnoDisponibleConPeluquero(Peluquero peluquero) {
        for (Turno turno : turnos) {
            if (turno.getPeluquero().equals(peluquero) && !existeTurnoEnHora(turno.getHora())) {
                return turno;
            }
        }
        return null; // Si no se encuentra ningún turno disponible con el peluquero especificado
    }

    private boolean existeTurnoEnHora(LocalDateTime hora) {
        for (Turno turno : turnos) {
            if (turno.getHora().equals(hora)) {
                return true;
            }
        }
        return false;
    }
}
