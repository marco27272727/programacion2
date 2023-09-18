package ejercicio2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<String> cualidades;
    protected ArrayList<Alumno> familiaresConcurrentes;
    private String casaPerteneciente;

    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cualidades = new ArrayList<>();
        this.familiaresConcurrentes = new ArrayList<>();
        this.casaPerteneciente = "";
    }

    // metodo que verifica si la cualidad esta en la lista de cualidades
    public boolean poseeCualidades(String nuevaCualidad){
        return this.cualidades.contains(nuevaCualidad);
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCasaPerteneciente() {
        return casaPerteneciente;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCasaPerteneciente(String casaPerteneciente) {
        this.casaPerteneciente = casaPerteneciente;
    }

    // metodos para agregar en el arreglo 
    public void agregarCualidades(String nuevaCualidad){
        if((this.cualidades != null) && (!poseeCualidades(nuevaCualidad))){
            this.cualidades.add(nuevaCualidad);
        }
    }

    public void agregarFamiliar(Alumno familiarDelAlumno){
        if((this.familiaresConcurrentes != null) && (!this.familiaresConcurrentes.contains(familiarDelAlumno))){
            this.familiaresConcurrentes.add(familiarDelAlumno);
        }
    }

    public void eliminarCualidad(String cualidadAEliminar){
        this.cualidades.remove(cualidadAEliminar);
    }

    public void imprimirCualidades(){
        System.out.print("Cualidades del alumno " + this.getNombre() + ": ");
        for (String cualidad : cualidades) {
          System.out.print(cualidad + " . ");
        }
        System.out.println("");
      }

    // compara si dos alumno son iguales
    @Override
    public boolean equals(Object obj){
        Alumno alumno = (Alumno)obj;
        return ((alumno.getNombre() == this.getNombre()) && (alumno.getApellido() == this.getApellido()));
    }

    @Override
    public String toString(){
        return ("Nombre: " + this.getNombre() + ", apellido: " +this.getApellido() + ", casa perteneciente: " + getCasaPerteneciente());
    }
}
