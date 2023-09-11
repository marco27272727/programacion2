import java.time.LocalDate;

public class Futbolista extends Persona{
    private String posicion;
    private boolean zurdo;
    private boolean derecho;
    private int cantidaDeGoles;
    
    public Futbolista(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, String estado, String posicion, boolean zurdo, boolean derecho, int cantidaDeGoles){
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, estado);
        this.posicion = posicion;
        this.zurdo = zurdo;
        this.derecho = derecho;
        this.cantidaDeGoles = cantidaDeGoles;
    }

    @Override
    public String toString(){
        return super.toString() + "posicion: " + getPosicion() + ", es zurdo: " + isZurdo() + ", es derecho: " + isDerecho() +", goles marcados: " + getCantidaDeGoles() + "}";
    }

    //getters
    public String getPosicion() {
        return posicion;
    }

    public boolean isZurdo() {
        return zurdo;
    }

    public boolean isDerecho() {
        return derecho;
    }

    public int getCantidaDeGoles() {
        return cantidaDeGoles;
    }

    //setters
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setZurdo(boolean zurdo) {
        this.zurdo = zurdo;
    }

    public void setDerecho(boolean derecho) {
        this.derecho = derecho;
    }

    public void setCantidaDeGoles(int cantidaDeGoles) {
        this.cantidaDeGoles = cantidaDeGoles;
    }
}
