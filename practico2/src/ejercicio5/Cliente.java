package ejercicio5;

public class Cliente {
    private String nombre;
    private boolean esFrecuente;
    private int turnoRegistrado;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.esFrecuente = false;
        this.turnoRegistrado = 0;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public boolean esFrecuente(){
        return esFrecuente;
    }

    public void registrarTurno(){
        this.turnoRegistrado++;
        if(this.turnoRegistrado >= 1){
            this.esFrecuente = true;
        }
    }
}
