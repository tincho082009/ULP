/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp.modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class Prueba {
   

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            Conexion conectar = new Conexion();
            
            //----     ALUMNOS    ----// 
            
             AlumnoData ad = new AlumnoData(conectar);
             
            //Alumno lorena = new Alumno("Lopez Lorena", LocalDate.now(), true);
           
            //ad.guardarAlumno(pepe);
            
            //ad.borrarAlumno(5);
            
            //List<Alumno> lista = ad.obtenerAlumnos();
            //for(Alumno x:lista){
                //System.out.println("nombre: " + x.getNombre());
                //System.out.println("Fecha de nacimiento: " + x.getFechNac());}
                
            //Alumno x = ad.buscarAlumno(0);
            //System.out.println("nombre: " + x.getNombre());
            //System.out.println("fecha de nacimiento: " + x.getFechNac());
            
            //ad.actualizarAlumno(lorena);
            
            
            
            //----    MATERIAS   ----//
            
            MateriaData md = new MateriaData(conectar);
            
            //Materia fisica = new Materia("Fisica");
            //Materia geografia = new Materia("Geografia");
      
            
            //md.guardarMateria(Fisica);
            
            //md.borrarMateria(6);
            
            //List<Materia> lista = md.obtenerMaterias();
            //for(Materia x: lista){
                //System.out.println("nombre: " + x.getNombre());}
                
            //Materia materia1 = md.buscarMateria(5);
            //System.out.println("nombre: " + materia1.getNombre());
            
            //md.actualizarMateria(geografia);
         
            
            //----    CURSADA    ----//
            
            CursadaData cd = new CursadaData(conectar);
            
            //Cursada y = new Cursada(cd.buscarMateria(2), cd.buscarAlumno(0), 5);
            //System.out.println("IdMateria: " + y.getMateria());
            //cd.guardarCursada(y);
            
           //List<Cursada> lista = cd.obtenerCursadas();
           //for(Cursada x: lista){
                //System.out.println("idCursada: " + x.getId());
                //System.out.println("idMateria: " + x.getMateria());
                //System.out.println("idAlumno: " + x.getAlumno());}
                
            //List<Cursada> lista2 = cd.obtenerCursadasXAlumno(1);
             //for(Cursada x:lista2){
                 //System.out.println("Cursada por alumno: " + x.getId());}  
                 
            //Alumno a = cd.buscarAlumno(0);
            //System.out.println("Nombre Alumno: " + a.getNombre());
            
            //Materia m = cd.buscarMateria(1);
            //System.out.println("Nombre Materia: " + m.getNombre());
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
