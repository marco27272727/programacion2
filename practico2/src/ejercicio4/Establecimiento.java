package ejercicio4;

import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Turno> turnos;

    public Establecimiento(){
        this.canchas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void agregarCancha(Cancha cancha){
        this.canchas.add(cancha);
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void agregarTurno(Turno turno){
        this.turnos.add(turno);
    }

}
