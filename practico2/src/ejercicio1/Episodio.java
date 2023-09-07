package ejercicio1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo, String descripcion, boolean flag, int calificacion){
        this.titulo = titulo;
        this. descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }

    
    public void ingresarCalificiacion(int calificacion){
        if(calificacion >= 1 && calificacion <=5){
            this.setCalificacion(calificacion);
        }
    }

    public void marcarVisto(){
        this.flag = true;
    }

    // Esto son los getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    // estos son los setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
}
