package ejercicio3;

import java.util.ArrayList;

public class EmpleadoPorComision extends Empleado {
    private static int montoFijoSemanal = 2000;
    private static int porcentajePorVenta = 14;
    private ArrayList<Integer> ventas;

    public EmpleadoPorComision(String nombre, long dni, int salario){
        super(nombre, dni, salario);
        this.ventas = new ArrayList<>();
    }

    // public int calcularCobroSemanla(){
    //     for (Integer venta : ventas) {

    //     }
    // }

    public void agregarVentas(Integer venta){
        this.ventas.add(venta);
    }
}
