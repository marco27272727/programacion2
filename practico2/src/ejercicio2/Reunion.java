package ejercicio2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
    private String ubicacion;
    private String tema;
    private LocalDateTime duracion;
    private ArrayList<Contacto> participantes;

    public Reunion(String ubicacion, String tema, LocalDateTime duracion){
        this.ubicacion = ubicacion;
        this.tema = tema;
        this.duracion = duracion;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Contacto participante){
        this.participantes.add(participante);
    }

    //getters
    public String getUbicacion() {
        return ubicacion;
    }

    public String getTema() {
        return tema;
    }

    public LocalDateTime getDuracion() {
        return duracion;
    }

    //setters
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setDuracion(LocalDateTime duracion) {
        this.duracion = duracion;
    }

    //equals que compara la fecha del dia,mes y el horario
    public boolean equals(Object o){
        try {
            Reunion otraReunion = (Reunion)o;

            //compara lo que es el dia del mes y ademas compara si la hora y los minutos son iguales
            return this.duracion.getDayOfMonth() == otraReunion.duracion.getDayOfMonth() &&
                   this.duracion.getHour() == otraReunion.duracion.getHour() &&
                   this.duracion.getMinute() == otraReunion.duracion.getMinute();
        } 
        catch (Exception e) {
            return false;
        }
    }

}
