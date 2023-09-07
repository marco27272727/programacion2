package ejercicio4;

public class Cancha {
    private String tipo; // futbol o paddle
    private double costoHora;

    public Cancha(String tipo, double costoHora){
        this.tipo = tipo;
        this.costoHora = costoHora;
    }

    //getters
    public double getCostoHora() {
        return costoHora;
    }

    public String getTipo() {
        return tipo;
    }

    //setters
    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
