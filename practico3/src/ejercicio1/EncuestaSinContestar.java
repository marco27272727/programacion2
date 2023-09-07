package ejercicio1;

import java.util.ArrayList;

public class EncuestaSinContestar {
  private static int menorEncuesta = 1;
  private static int mayorEncuesta = 5;
  private int id;
  private ArrayList<String> preguntas;

  public EncuestaSinContestar(int idEncuesta, String[] preguntas_a_insertar){
    setIdEncuesta(idEncuesta);
    this.preguntas = new ArrayList<>();
    agregarPreguntas(preguntas_a_insertar);
  }

  /**
   * Setea el id de la encuesta, en caso de que el id este fuera del rango permitido, 
   * se eligira la encuesta valida mas proxima a la ingresada.
   * @param id de la encuesta a crear
   */
  private void setIdEncuesta(int id){
    if((id >= menorEncuesta) && (id <= mayorEncuesta)){
      this.id = id;
    }else{
      this.id = (id > mayorEncuesta)? mayorEncuesta : menorEncuesta;
    }
  }

  private void agregarPreguntas(String[] preguntasAI){
    // Se valida que el array no sea null
    if(preguntasAI.length > 0){
      for (String pregunta : preguntasAI) {
        // Se valida que la pregunta no sea ni null ni " "
        if((!pregunta.isEmpty()) && (!pregunta.isBlank())){
          preguntas.add(pregunta);
        }
      }
    }
  }

  public int getId(){return id;}

  /**
   * 
   * @return un arreglo de Strings, cada indice contiene una pregunta del ArrayList
   */
  public String[] getPreguntasArray(){
    // Creamos un arreglo de tamaño igual al size de "preguntas"
    String[] preguntasArray = new String[preguntas.size()];
    // Creamos una copia de los datos de "preguntas" y los asignamos en preguntas_array
    preguntas.toArray(preguntasArray);

    return preguntasArray;
  }

  /**
   * Devuelve todas las preguntas de la encuesta
   * @return Todas las preguntas en una sola String
   */
  public String getPreguntas() {
    // Creamos un arreglo con las preguntas.
    String[] preguntasArray = getPreguntasArray();
    
    String cadenaDeVolver = "";
    // Iteramos el array para crear una cadena con todas las preguntas
    for (String pregunta : preguntasArray) {
      cadenaDeVolver+=pregunta + " ";
    }
    cadenaDeVolver += "";
    return cadenaDeVolver;
  }

  @Override
  public String toString(){
    return "{id: " + getId() + ", preguntas: (" + getPreguntas() + ")}";
  }

  @Override
  public boolean equals(Object encuestaComparada) {
    EncuestaSinContestar encuesta = (EncuestaSinContestar) encuestaComparada;

    return (encuesta.getId() == this.getId()); 
  }
}
