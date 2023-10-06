/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p5;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 */
public class Alumno {
    private int semestre;
    private Fecha fNACIMIENTO;
    private String nombre, apellido, carrera, escuela;
    
    public Alumno() {
    }

    public Alumno(int semestre, Fecha fNACIMIENTO, String nombre, String apellido, String carrera, String escuela) {
        this.semestre = semestre;
        this.fNACIMIENTO = fNACIMIENTO;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public Fecha getfNACIMIENTO() {
        return fNACIMIENTO;
    }

     /**
     * Método que regresa el nombre del alumno
     * @return regresa el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setfNACIMIENTO(Fecha fNACIMIENTO) {
        this.fNACIMIENTO = fNACIMIENTO;
    }

     /**
     * Método que modifica el nombre del alumno
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }  
    
    /**
     * Método que imprime una frase que da a entender que el alumno se fue a dormir
     */
    public void dormir()
    {
        System.out.println("zzz");
    }
    
    public void comer()
    {
        System.out.println("Niam niam");
    }
    
    public void estudiar()
    {
        System.out.println("Por fin un estudiante que si estudia");
    }
    public void trabajar()
    {
        System.out.println("Ese dinerito no se gana solo, a trabajar!");
    }
    
    public void jugar(String nombreGame)
    {
        System.out.println("No molesten ando jugando " + nombreGame);
    }

    @Override
    public String toString() {
        return "Alumno{" + "semestre=" + semestre + ", fNACIMIENTO=" + fNACIMIENTO + ", nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + '}';
    }
    
}
