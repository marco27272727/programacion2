package ejercicio1;

public class Alarma {
    private boolean vidrio;
    private boolean abertura;
    private boolean movimiento;
    private Timbre timbre;

    public Alarma (){
        this.vidrio = false;
        this.abertura = false;
        this.movimiento = false;
        this.timbre  = new Timbre();
    }

    //getters
    public boolean isAbertura() {
        return abertura;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public boolean isVidrio() {
        return vidrio;
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void comprobar(){
        if (this.isAbertura() || this.isMovimiento() || this.isVidrio()){
            this.timbre.hacerSonar();
        }
    }

    public void desactivarAlarma(){
        if(this.timbre.isSonando()){
            this.timbre.dejarDeSonar();
        }
    }
}
