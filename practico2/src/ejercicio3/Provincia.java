package ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad){
        this.ciudades.add(ciudad);
    }

    public boolean tieneMasDeLaMitadDeCiudadesEnDeficit(){
        int totalCiudades = this.ciudades.size();
        int ciudadesEnDeficit  = 0;
        for(Ciudad ciudad : ciudades){
            if(ciudad.getBalance() < 0){
                ciudadesEnDeficit++;
            }
        }
        return ciudadesEnDeficit > totalCiudades/2;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
