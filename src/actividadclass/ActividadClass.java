/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclass;

/**
 *
 * @author germa
 */
public class ActividadClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Estudiante = new Persona();
        Estudiante.setNombre("German");
        Estudiante.setTipo("Estudiante");
        Estudiante.setSexo('M');
        Estudiante.setEdad(20);
        Estudiante.setCurp("MACG001206HCCYHRA5");
        Estudiante.setActividad("Tomar clases");

        System.out.println(Estudiante);
        Estudiante.Entrada();

        Edificio Enfermeria = new Edificio();
        Enfermeria.setArea("Salud");
        Enfermeria.setCampus("6");
        Enfermeria.setEnergiaElectrica(true);
        Enfermeria.setMts2(500);
        
        System.out.println(Enfermeria);
        Enfermeria.Acciones();

    }
    
}
