package ejercicio1;

public class Empleado {
    private long dni;
    private String nombre;

    public Empleado(long dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    //getters
    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o){
        try {
            Empleado emp = (Empleado)o;
            
            return emp.getDni() == this.getDni();   
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString(){
        return "DNI: " + this.getDni() + ", nombre: " + this.getNombre();
    }
}
