package ejercicio1;

public class Luz {
    private boolean luces;

    public Luz(){
        this.luces = true;
    }

    public boolean isLuces() {
        return luces;
    }

    public void apagarLuz(){
        this.luces = false;
    }

    public void encenderLuz(){
        this.luces = true;
    }
}
