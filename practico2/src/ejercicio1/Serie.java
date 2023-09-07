package ejercicio1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada){
        this.temporadas.add(temporada);
    }

    public int totalEpisodiosVistos(){
        int total = 0;
        for (int i = 0; i < this.temporadas.size(); i++) {
            total += this.temporadas.get(i).totalEpisodiosVistos();
        }
        return total;
    }

    public double promedioCalificaciones(){
        int totalVistos = 0;
        int sumaCalificaciones = 0;
        for (int i = 0; i < this.temporadas.size(); i++) {
            totalVistos += this.temporadas.get(i).totalEpisodiosVistos();
            sumaCalificaciones += this.temporadas.get(i).promedioCalificar() * this.temporadas.get(i).totalEpisodiosVistos();    
        }
        return sumaCalificaciones / totalVistos;
    }

    // en este metodo lo sque hace es verificar que en cada temporada revisa cada episodio si lo vio o no, en caso de que encuentre un flag, va a retornar false
    // eso quiere decir que no vio todos los episodios de la serie y si devuelve true quiere decir que si vio todos los capitulos de la serie
    public boolean todosEpisodiosVistos(){
        for (Temporada temporada : temporadas) {
            for (Episodio episodio : temporada.getEpisodios()) {
                if(!episodio.isFlag()){
                    return false;
                }               
            }
        }
        return true;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
