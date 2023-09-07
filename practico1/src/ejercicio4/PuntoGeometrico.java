package ejercicio4;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(){
        this(0, 0);
    }

    public PuntoGeometrico(int x){
        this(x,0);
    }



    public PuntoGeometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Metodo que desplaza el punto en el plano 
    // preguntar si esta bien solamente hacer los setters de x e y
    // o tengo que hacer la suma de esos puntos geometrico para desplazar
    public void desplazar(double x2, double y2){
        setX(x2);
        setY(y2);
    }

    // En este metodo utilizamos la biblioteca Math para poder sacar la distancia
    public double distanciaEuclidiana(int x2, int y2){
        double distancia = Math.sqrt((Math.pow((this.getX() - y2), 2)) + (Math.pow((this.getY() - y2), 2)));
        return distancia;
    }
}
