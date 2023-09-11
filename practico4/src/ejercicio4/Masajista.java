import java.time.LocalDate;

public class Masajista extends Persona{
    private String titulo;
    private int cantDeAnios;
    
    public Masajista(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, String estado, String titulo, int cantDeAnios){
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, estado);
        this.titulo = titulo;
        this.cantDeAnios = cantDeAnios;
    }

    @Override
    public String toString(){
        return super.toString()  + ", titulo: " + getTitulo() + ", cantidad de anios trabajados: " + getCantDeAnios();
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getCantDeAnios() {
        return cantDeAnios;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCantDeAnios(int cantDeAnios) {
        this.cantDeAnios = cantDeAnios;
    }
}
