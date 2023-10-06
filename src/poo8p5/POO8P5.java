/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8p5;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 */
public class POO8P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno = new Alumno ();
        alumno.setNombre("Berenice");
        alumno.setApellido("De Luna");
        alumno.setCarrera("Ingenieria en Computación");
        alumno.setEscuela("UNAM");
        alumno.setSemestre(3);
       
        Fecha fechaN = new Fecha (13, 05, 2004);
        
        Alumno nikole = new Alumno (3,fechaN ,"Nikole","Calderon","Ingenieria en Computación", "UNAM");
        
        String var = alumno.toString();
        System.out.println(var);
        //System.out.println(alumno.toString());
        System.out.println(nikole);
        
    }
    
}
