package ejercicio1;

public class EncuestaContestada {
  private EncuestaSinContestar encuestaRespondida;
  private Empleado empleado;
  private long dniEncuestado;
  
  public EncuestaContestada(EncuestaSinContestar encuestaRespondida, long dniEncuestado, Empleado empleado){
    this.encuestaRespondida = encuestaRespondida;
    this.dniEncuestado = dniEncuestado;
    this.empleado = empleado;
  }

  // Getters
  public int getEncuestaRespondida(){return encuestaRespondida.getId();}
  public long getDniEncuestado() {return dniEncuestado;}
  public Empleado getEmpleado(){return empleado;}

  @Override
  public boolean equals(Object encuestaComparar){
    EncuestaContestada encuesta = (EncuestaContestada)encuestaComparar;
    // Si el DNI y el id de la encuesta coinciden, son iguales
    return ((encuesta.getEncuestaRespondida() == this.getEncuestaRespondida()) && (encuesta.getDniEncuestado() == this.getDniEncuestado()));
  }

  @Override
  public String toString(){
    return "{Id encuesta: " + getEncuestaRespondida() + ", empleado: [" + getEmpleado() + "], dni del encuestado: " + getDniEncuestado() + "}";
  }
}
