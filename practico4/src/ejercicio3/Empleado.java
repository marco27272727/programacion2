package ejercicio3;

public class Empleado {
    private String nombre;
    private Long dni;
    private int salario;

    public Empleado(String nombre, Long dni, int salario){
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Long getDni() {
        return dni;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
