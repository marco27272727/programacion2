import java.util.ArrayList;

public class Contingente {
    String pais;
    private ArrayList<Persona> integrantes;

    public Contingente(String pais){
        this.pais = pais;
        this.integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(Persona nuevaPersona){
        if(nuevaPersona != null){
            this.integrantes.add(nuevaPersona);
        }
    }

    
}
