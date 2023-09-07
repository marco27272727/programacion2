package ejercicio1;

import java.time.LocalDate;

public class Persona {
    private String nombreyAp;
    private int edad;
    private LocalDate birthdate;
    private long dni;
    private String sexo;
    private float peso;
    private float altura;

    public Persona(long dni){
        this(dni,"N");
    }

    public Persona(long dni, String nombreyAp){
        this(dni,nombreyAp, LocalDate.of(2000, 1, 1));
    }

    public Persona(long dni, String nombreyAp, LocalDate birthdate){
        this(dni, nombreyAp, birthdate, "Femenino");
    }

    public Persona(long dni, String nombreyAp, LocalDate birthdate, String sexo){
        this(dni, nombreyAp, birthdate, sexo, 1);
    }

    public Persona(long dni, String nombreyAp, LocalDate birthdate, String sexo, float altura){
        this(dni, nombreyAp, birthdate, sexo, altura, 1);
    }

    public Persona(long dni, String nombreyAp, LocalDate birthdate, String sexo, float altura, float peso){
        this.dni = dni;
        this.nombreyAp = nombreyAp; 
        this.birthdate = birthdate;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    //metodo que calcula el indice de la masa corporal 
    public float indiceDeMasaCorporal(){
        return (this.peso) / (this.altura * this.altura); 
    }

    //metodo que verifica si la persona esta en forma
    public boolean estaEnForma(){
        if(this.indiceDeMasaCorporal() >= 18.5 &&  this.indiceDeMasaCorporal()<= 25){
            return true;
        }
        else 
            return false;
    }

    //metodo que verifica si cumple años la persona
    public boolean cumpleAño(){
        if(this.birthdate.getDayOfMonth() == LocalDate.now().getDayOfMonth() && this.birthdate.getMonth() == LocalDate.now().getMonth()){
            return true;
        }
        else
            return false;
    }

    //metodo que verifica si es mayor de edad 
    public boolean mayoriaDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        else
            return false;
    }

    // esto son los getters
    public long getDni() {
        return dni;
    }

    public String getNombreyAp() {
        return nombreyAp;
    }

    public String getSexo() {
        return sexo;
    }

    // esto son los setters
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombreyAp(String nombreyAp) {
        this.nombreyAp = nombreyAp;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // metodo que verifica si la persona puede votar
    public boolean puedeVotar(){
        if(this.edad >= 16){
            return true;
        }
        else
            return false;
    }

    //metodo que verifica si la edad que tiene una persona coincide
    // con su fecha de nacimiento
    public boolean esCoherenteLaFechaDeNacimiento(){
        int anioNacimiento = this.birthdate.getYear();
        int anioActual = LocalDate.now().getYear();
        int edad = anioActual - anioNacimiento;
        if(this.edad == edad){
            return true;
        }
        else
            return false;
    }

    

}
