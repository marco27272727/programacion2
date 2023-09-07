package ejercicio3;

public class Ciudad {
    private String nombre;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastoMantenimiento;

    public Ciudad(String nombre, double imp1,double imp2,double imp3,double imp4,double imp5,double gastoMantenimiento){
        this.nombre = nombre;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastoMantenimiento = gastoMantenimiento;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public double getGastoMantenimiento() {
        return gastoMantenimiento;
    }

    public double getTotalRecaudado(){
        return this.imp1 + this.imp2 + this. imp3 + this.imp4 + this.imp5;
    }

    public double getBalance(){
        return this.getTotalRecaudado() - this.getGastoMantenimiento();
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGastoMantenimiento(double gastoMantenimiento) {
        this.gastoMantenimiento = gastoMantenimiento;
    }

}
