package ejercicio3;

public class EmpleadoPorhoraExtra extends Empleado {
    private int cantHorasExtra;
    private static int montoFijo = 3000;
    private static int montoExtraPorHora = 300;


    public EmpleadoPorhoraExtra(String nombre, Long dni, int salario, int cantHorasExtra){
        super(nombre, dni, salario);
        this.cantHorasExtra = cantHorasExtra;
    }

    public int calcularCobroSemanla(){
        return this.getSalario() + montoFijo + (this.getCantHorasExtra() * montoExtraPorHora);
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + ", Dni: " + this.getDni() + ", Salario Semanal: " + this.calcularCobroSemanla();
    }

    //getters
    public int getCantHorasExtra() {
        return cantHorasExtra;
    }

    //setters
    public void setCantHorasExtra(int cantHorasExtra) {
        this.cantHorasExtra = cantHorasExtra;
    }
}
