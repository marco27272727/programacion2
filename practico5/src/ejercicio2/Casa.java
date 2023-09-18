package ejercicio2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int maxCapacidad;
    private ArrayList<String> cualidades;
    protected ArrayList<Alumno> alumnos;

    public Casa(String nombre, int maxCapacidad){
        this.nombre = nombre;
        this.maxCapacidad = maxCapacidad;
        this.cualidades = new ArrayList<>();
        this.alumnos = new ArrayList<>(); 
    }

    public boolean poseeCualidad(String nuevaCualidad){
        return this.cualidades.contains(nuevaCualidad);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getMaxCapacidad() {
        return maxCapacidad;
    }

    public int getCantAlumnosPertenecientes(){
        return this.alumnos.size();
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setMaxCapacidad(int maxCapacidad) {
        this.maxCapacidad = maxCapacidad;
    }

    // metodos para agregar en los arreglos
    public void agregarCualidad(String nuevaCualidad){
        if (this.cualidades != null && this.poseeCualidad(nuevaCualidad)){
            this.cualidades.add(nuevaCualidad);
        }
    }

    public boolean casaLlena(){
        return this.alumnos.size() >= this.getMaxCapacidad();
    }

    public boolean estaCalificado(Alumno nuevoAlumno){
        for (String cualidad : this.cualidades) {
            if (!nuevoAlumno.poseeCualidades(cualidad)){
                return false;
            }    
        }
        return true;
    }

    public void imprimirCualidades(){
        System.out.print("Cualidades de la casa " + this.getNombre() + ": ");
        for (String cualidad : cualidades) {
            System.out.print(cualidad + " . ");
        }
        System.out.println("");
    }

    public void agregarAlumno(Alumno nuevoAlumno){
        if(this.casaLlena()){
            System.out.println("La casa " + this.getNombre() + " ya esta llena."); 
            return; 
        }
        if (nuevoAlumno.getCasaPerteneciente() != "") {
            System.out.println(nuevoAlumno.getNombre() + " ya pertenece a la casa: " + nuevoAlumno.getCasaPerteneciente());
        }
        if (!this.estaCalificado(nuevoAlumno)) {
            System.out.println(nuevoAlumno.getNombre() + " no posee con todas las cualidades de la casa " + this.getNombre()); 
            this.imprimirCualidades();
            nuevoAlumno.imprimirCualidades();
            return;           
        }
        
        // en caso de que las validaciones anteriores no salten, lo agrego a la lista de alumnos de la casa
        nuevoAlumno.setCasaPerteneciente(this.getNombre());
        this.alumnos.add(nuevoAlumno);
    }

    @Override
    public boolean equals(Object obj){
        Casa casa = (Casa)obj;
        return casa.getNombre() == this.getNombre();
    }

    @Override
    public String toString(){
        return ("Nombre" + this.getNombre() + ", maxima capacidad" + this.getMaxCapacidad()+ ", cantidad alumnos anotados" + this.getCantAlumnosPertenecientes());
    }

}
