package ejercicio2;

public class CasaSangrePura extends Casa {
    
    public CasaSangrePura(String nombre, int maxCapacidad){
        super(nombre, maxCapacidad);
    }

    public void agregarAlumno(Alumno nuevoAlumno){
        // Valido que haya espacio en la casa.
        if(casaLlena()){
            System.out.println("La casa " + this.getNombre() + " ya esta llena."); 
            return;
        }
        if(nuevoAlumno.getCasaPerteneciente() != ""){
            System.out.println(nuevoAlumno.getNombre() + " ya pertenece a la casa: " + nuevoAlumno.getCasaPerteneciente());
        }
        // Valido que el alumno tenga todas las cualidades requeridas que pide la casa.
        if(!estaCalificado(nuevoAlumno)){
          System.out.println(nuevoAlumno.getNombre() + " no posee con todas las cualidades de la casa " + this.getNombre()); 
          this.imprimirCualidades();
          nuevoAlumno.imprimirCualidades();
          return;
        }
        // Valido que un familiar del alumno este en la lista de alumnos de la casa.
        if(!tieneFamiliarEnLaCasa(nuevoAlumno)){
            System.out.println(nuevoAlumno.getNombre() + " no posee ningun familiar en la casa " + this.getNombre()); 
            return;
        }
        // En caso de que las validaciones no salten, lo agrego a la lista de alumnos de la casa
        nuevoAlumno.setCasaPerteneciente(this.getNombre());
        alumnos.add(nuevoAlumno);
      }

    public boolean tieneFamiliarEnLaCasa(Alumno alumnoComprobar){
        for (Alumno familiarAlumnoActual : alumnoComprobar.familiaresConcurrentes) {
            if(alumnos.contains(familiarAlumnoActual)){
                return true;
            }
        }
        return false;
    }

    public void agregarFamiliarHardcodeado(Alumno alumnoHarcodeado){
        if(alumnoHarcodeado != null){
            alumnos.add(alumnoHarcodeado);
        }
    }
}
