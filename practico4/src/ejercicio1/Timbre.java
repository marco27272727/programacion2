package ejercicio1;

public class Timbre {
    
    private boolean sonando;

    public Timbre(){
        this.sonando = false;
    }

    public boolean isSonando() {
        return sonando;
    }

    public void encenderTimbre(){
        this.sonando = true;
    }

    public void apagarTimbre(){
        this.sonando = false;
    }

    public String hacerSonar(){
        encenderTimbre();
        return "PIIIIIIIIIIIIIIIIIIIIIII!!!!!!!!!!!!";
    }

    public String dejarDeSonar(){
        apagarTimbre();
        return "El timbre dejo de sonar";
    }
}
