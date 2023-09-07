package ejercicio2;

import java.util.ArrayList;

public class AgendaPersonal {
    private ArrayList<Reunion> reuniones;

    public AgendaPersonal(){
        reuniones = new ArrayList<>();
    }

    public void addReunion(Reunion reunion){
        reuniones.add(reunion);
    }

    public boolean hayConflicto(Reunion nuevaReunion){
        for (Reunion reunionExistente : reuniones){
            //si devuelve true es porque ya existe una reunion en ese dia a esa hora
            if(nuevaReunion.equals(reunionExistente)){
                return true;
            }
        }
        //si de vuelve false quiere decir que no existe una reunion ese dia a esa hora 
        return false;
    }
}
