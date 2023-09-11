import java.time.LocalDate;

public class Entrenador extends Persona{
    private int idIdentificador;
    
    public Entrenador(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, String estado, int idIdentificador){
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, estado);
        this.idIdentificador = idIdentificador;
    }

    @Override
    public String toString(){
        return super.toString() + "Numero de identidicacion de la federacion : " + getIdIdentificador();
    }
    //getter
    public int getIdIdentificador() {
        return idIdentificador;
    }

    //setter
    public void setIdIdentificador(int idIdentificador) {
        this.idIdentificador = idIdentificador;
    }
}
