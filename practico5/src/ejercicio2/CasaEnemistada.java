package ejercicio2;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
    private ArrayList<Casa> casaEnemigas;

    public CasaEnemistada(String nombre, int maxCapacidad){
        super(nombre, maxCapacidad);
        this.casaEnemigas = new ArrayList<>();
    }

    public void agregarCasaEnemiga(Casa casaNueva){
        if(this.casaEnemigas != null && !this.casaEnemigas.contains(casaNueva)){
            this.casaEnemigas.add(casaNueva);
        }
    }

    public void agregarAlumno(Alumno nuevoAlumno){
        if(casaLlena()){
            System.out.println("La casa " + this.getNombre() + " ya esta llena."); return;
        }
        if(nuevoAlumno.getCasaPerteneciente() != ""){
            System.out.println(nuevoAlumno.getNombre() + " ya pertenece a la casa: " + nuevoAlumno.getCasaPerteneciente());
        }
        // Valido que el alumno tenga todas las cualidades requeridas que pide la casa
        if(!estaCalificado(nuevoAlumno)){
            System.out.println(nuevoAlumno.getNombre() + " no posee con todas las cualidades de la casa " + this.getNombre()); 
            this.imprimirCualidades();
            nuevoAlumno.imprimirCualidades();
            return;
        }
        if(puedeEnlistarseEnCasaEnemiga(nuevoAlumno)){
            System.out.println(nuevoAlumno.getNombre() + " puede enlistarse en una de las casas enemigas..."); return;
        }
        // En caso de que las validaciones no salten, lo agrego a la lista de alumnos de la casa
        nuevoAlumno.setCasaPerteneciente(this.getNombre());
        alumnos.add(nuevoAlumno);
    }

    public boolean puedeEnlistarseEnCasaEnemiga(Alumno alumnoEvaluar){
        for(Casa casaActual : this.casaEnemigas){
            if(casaActual.estaCalificado(alumnoEvaluar)){
                return true;
            }
        }
        return false;
    }
}
