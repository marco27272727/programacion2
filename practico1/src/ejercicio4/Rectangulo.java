package ejercicio4;

public class Rectangulo {
    private PuntoGeometrico vertice;
    private double base;
    private double altura;

    public Rectangulo(PuntoGeometrico vertice, double base, double altura){
        this.vertice = vertice;
        this.base = base;
        this.altura = altura;
    }

    //getters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public PuntoGeometrico getVertice() {
        return vertice;
    }

    //setters
    public void setVertice(PuntoGeometrico vertice) {
        this.vertice = vertice;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodo que desplaza en el plano, el rectangulo con nuevas coordenadas x e y
    public void desplazaEnElPlano(double x1, double y1){
        this.vertice.desplazar(x1,y1);
    }

    //metodo que calcula el area de un rectangulo
    public double calcularArea(){
        return this.getBase() * this.getAltura();
    } 

    // este metodo lo que hacer es ver el area de un rectangulo con otro
    public int compararCom(Rectangulo rectangulo2){
        double area1 = this.calcularArea();
        double areaComparar = this.calcularArea();
        if(area1 > areaComparar){
            return 1;
        }
        else if(area1 == areaComparar){
            return 0;
        }
        else
            return -1;
    }

    public boolean esCuadrado(){
        if (this.getAltura() == this.getBase()){
            return true;
        }
        else
            return false;
    }

    public double obtenerLadoSuperior(){
        return this.getAltura();
    }

    public boolean estaAcostado(){
        if(this.getAltura() > this.getBase()){
            return true;
        }
        else
            return false;
    }
}
