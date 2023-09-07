package ejercicio1;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios = new ArrayList<>();

    // preguntar si es necesario hacer el constructor de temporada

    public void agregarEpisodios(Episodio episodio){
        this.episodios.add(episodio);
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public int totalEpisodiosVistos(){
        int total = 0;
        for (int i = 0; i < this.episodios.size(); i++) {
            if(this.episodios.get(i).isFlag()){
                total++;
            }    
        }
        return total;
    }

    public double promedioCalificar(){
        int totalVistos = 0;
        int sumaCalificaciones = 0;
        for (int i = 0; i < this.episodios.size(); i++) {
            if(this.episodios.get(i).isFlag()){
                totalVistos++;
                sumaCalificaciones += this.episodios.get(i).getCalificacion();
            }            
        }
        return sumaCalificaciones/totalVistos;
    }
}
