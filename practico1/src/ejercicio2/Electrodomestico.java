package ejercicio2;

public class Electrodomestico {
    private String nombre;
    private int precioBase;
    private String color;
    private int kW;
    private int peso;

    public Electrodomestico(String nombre){
        this(nombre,0,"gris plata",0,0);
    }

    public Electrodomestico(String nombre, int precioBase){
        this(nombre,precioBase,"gris plata",0,0);
    }

    public Electrodomestico(String nombre, int precioBase, String color){
        this(nombre,precioBase,color,0,0);
    }

    public Electrodomestico(String nombre, int precioBase, String color, int kW){
        this(nombre, precioBase, color,kW,0);
    }

    public Electrodomestico(String nombre, int precioBase, String color, int kW, int peso){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.kW = kW;
        this.peso = peso;
    }

    //todos los getters
    public String getNombre() {
        return nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public int getkW() {
        return kW;
    }

    public int getPeso() {
        return peso;
    }

    //todos los setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // metodo que verifica si el electrodomestico es de bajo consumo
    public Boolean esBajoConsumo(){
        if(this.getkW() < 45){
            return true;
        }
        else
            return false;
    }

    //metodo que calcula el balance
    public int calcularBalance(){
        return this.getPrecioBase() / this.getPeso();
    }

    // metodo que calcula si el electrodomestico es de alta gama
    public boolean esAltaGama(){
        return (this.calcularBalance() > 3)? true : false;  // esto es lo mismo que hacer un if else pero solamente se utiliza menos codigo
    }  
}
