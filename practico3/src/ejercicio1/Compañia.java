package ejercicio1;

import java.util.ArrayList;

public class Compañia{
  private ArrayList<EncuestaSinContestar> encuestasSinCompletar;
  private ArrayList<EncuestaContestada> encuestasCompletadas;
  private ArrayList<Empleado> empleados; // Guarda los dni's de los empleados (No me deja crear un ArrayList de tipo "Long")

  public Compañia(EncuestaSinContestar[] encuestasSinCompletar, Empleado[] nuevos_empleados){
    // Inicializando los ArrayList
    this.encuestasSinCompletar = new ArrayList<>();
    this.encuestasCompletadas = new ArrayList<>();
    this.empleados = new ArrayList<>();

    addEncuestasBase(encuestasSinCompletar);
    addEmpleados(encuestasCompletadas);
  }

  /**
   * Dado un array de encuestas base, agrega las encuestas validos (Que no sean null, ni que ya esten presente en la lista de encuestas base)
   * @param encuestas_sin_completar son las encuestas a añadir a la lista de encuestas base.
   */
  public void addEncuestasBase(EncuestaSinContestar[] encuestasSinCompletar){
    // Se valida que no sea null
    if(encuestasSinCompletar != null){
      // Se valida que el array contenga algun elemento
      if (encuestasSinCompletar.length > 0){
        for (EncuestaSinContestar nuevaEncuesta : encuestasSinCompletar) {
          addNuevaEncuestaBase(nuevaEncuesta);
        }
      }
    }
  }

  /**
   * Agrega una encuesta base a la lista (Solo si no es null, ni ya se encuentra cargado en la lista)
   * @param encuestaAgregar es la encuesta base a agregar.
   */
  public void addNuevaEncuestaBase(EncuestaSinContestar encuestaAgregar){
    // Se valida que el objeto no sea null, ni que ya se encuentre ese objeto en la lista de empleados (Compara por el id de la encuesta).
    if((encuestaAgregar != null) && (!encuestasSinCompletar.contains(encuestaAgregar))){
      encuestasSinCompletar.add(encuestaAgregar);
    }
  }

  /**
   * Dado un array de empleados, agrega los empleados validos (Que no sean null, ni que ya esten presente en la lista de empleados)
   * @param nuevosEmpleados es el array de empleados a agregar.
   */
  public void addEmpleados(Empleado[] nuevosEmpleados){
    // Se valida que no sea null
    if(nuevosEmpleados != null){
      // Se valida que el array contenga algun elemento
      if (nuevosEmpleados.length > 0){
        for (Empleado nuevoEmpleado : nuevosEmpleados) {
          addEmpleado(nuevoEmpleado);
        }
      }
    }
  }

  /**
   * Agrega un empleado a la lista (Solo si no es null, ni ya se encuentra cargado en la lista)
   * @param nuevoEmpleado es el empleado a agregar.
   */
  public void addEmpleado(Empleado nuevoEmpleado){
    // Se valida que el objeto no sea null, ni que ya se encuentre ese objeto en la lista de empleados (Compara por el DNI).
    if((nuevoEmpleado != null) && (!empleados.contains(nuevoEmpleado))){
      empleados.add(nuevoEmpleado);
    }
  }

  public String verEmpleados(){
    String respuesta = "{Empleados: ";
    Empleado[] empleados_arr = new Empleado[empleados.size()];
    empleados.toArray(empleados_arr);
    for (Empleado empleado_actual : empleados_arr) {
      respuesta+= "{" + empleado_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  public String verEncuestasSinCompletar(){
    String respuesta = "{Encuestas sin completar (base): ";
    EncuestaSinContestar[] encuestas_arr = new EncuestaSinContestar(0, null)[encuestas_sin_completar.size()];
    encuestasSinCompletar.toArray(encuestas_arr);
    for (EncuestaSinContestar encuesta_actual : encuestas_arr) {
      respuesta+= "{" + encuesta_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  public String verEncuestasCompletadas(){
    String respuesta = "{Encuestas completadas: ";
    EncuestaContestada[] encuestas_arr = new EncuestaContestada[][encuestas_completadas.size()];
    encuestasCompletadas.toArray(encuestas_arr);
    for (EncuestaContestada encuesta_actual : encuestas_arr) {
      respuesta+= "{" + encuesta_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  /**
   * Dada una encuesta completada, se evalua si se agrega o no a la lista de encuestas completadas
   * @param encuesta_completada_a_agregar es la encuesta completada a añadir a la lista, esta no debe haber sido
   * completada anteriormente por la misma persona (Se verifica por el id de la encuesta y el DNI del encuestado)
   */
  public void registrarEncuesta(EncuestaContestada encuesta_completada_a_agregar){
    // Validamos que no sea nula
    if(encuesta_completada_a_agregar != null){
      // Se verifica que el encuestado no haya realizado esa encuesta en el pasado.
      if(!encuestasCompletadas.contains(encuesta_completada_a_agregar)){
        encuestasCompletadas.add(encuesta_completada_a_agregar);
      }
    }
  }
}
