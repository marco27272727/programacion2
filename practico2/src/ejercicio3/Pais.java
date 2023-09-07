package ejercicio3;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(){
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincias(Provincia provincia){
        this.provincias.add(provincia);
    }

    //este metodo lo que hace es recorre la lista de provincia y por cada provincia recorre 
    // la lista de ciudades y si la ciudad tiene un balance menor a 0, entonces se lo 
    // va a meter en una lista de ciudades con deficit y por ultimo el metodo de vuelve esa lista
    // con todas las ciudades que gastan mas de lo que recaudan.
    public ArrayList<Ciudad> ciudadesConGastosMayoresALosIngresados(){
        ArrayList<Ciudad> ciudadesConDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if(ciudad.getBalance() < 0){
                    ciudadesConDeficit.add(ciudad);
                }    
            }
        }
        return ciudadesConDeficit;
    }

    // en este metodo lo que hace es recorre la lista de las provincias y 
    // verifica si esa provincia tiene mas de la mitad de las ciudad con deficit
    // y si lo tiene lo agrega a un arreglo de privincias con ciudades de deficit y por ultimo
    // retorna esa lista.
    public ArrayList<Provincia> provinciasConMasCiudadesEnDeficit(){
        ArrayList<Provincia> provinciasConDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if(provincia.tieneMasDeLaMitadDeCiudadesEnDeficit()){
                provinciasConDeficit.add(provincia);
            }    
        }
        return provinciasConDeficit;
    }
}
