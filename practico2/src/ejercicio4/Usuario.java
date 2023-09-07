package ejercicio4;

public class Usuario {
    private String nombre;
    private boolean esSocio;
    private int turnosReservados;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.turnosReservados = 0;
        this.esSocio = false;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public boolean esSocio(){
        return esSocio;
    }

    public void registrarTurno(){
        this.turnosReservados++;
        if(this.turnosReservados >= 4){
            this.esSocio = true;
        }
    }
}
