import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroDePasaporte;
    private LocalDate fechaDeNacimiento;
    private String estado;

    public Persona(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDePasaporte = numeroDePasaporte;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    @Override
    public String toString(){
        return  "nombre: " + this.getNombre() + ", apellido: " + this.getApellido() + ", numero pasaporte: " + this.getNumeroDePasaporte() + ", fecha nacimiento: " + this.getFechaDeNacimiento() + ", estado: " + this.getEstado() + ", ";
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroDePasaporte() {
        return numeroDePasaporte;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public String getEstado() {
        return estado;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDePasaporte(int numeroDePasaporte) {
        this.numeroDePasaporte = numeroDePasaporte;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
