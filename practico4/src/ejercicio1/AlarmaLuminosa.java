package ejercicio1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(){
        super();
        this.luz = new Luz();
    }

    public void comprobar(){
        if(this.isVidrio() || this.isMovimiento() || this.isAbertura()){
            this.getTimbre().hacerSonar();
            this.luz.encenderLuz();
        }
    }

    public void desactivarAlarma(){
        super.desactivarAlarma();
    }
}
