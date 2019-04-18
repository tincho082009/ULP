/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp.modelo;

import java.time.LocalDate;

/**
 *
 * @author Agustin
 */
public class Alumno {
    private int idAlumno = -1;
    private String nombre;
    private LocalDate fechNac;
    private boolean activo;

    public Alumno(int idAlumno, String nombre, LocalDate fechNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.fechNac = fechNac;
        this.activo = activo;
    }

    public Alumno(String nombre, LocalDate fechNac, boolean activo) {
        this.idAlumno = -1;
        this.nombre = nombre;
        this.fechNac = fechNac;
    }
    
    public Alumno(){ }
    
    public int getId() {
        return idAlumno;
    }

    public void setId(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    public String toString(){
        
        
        return idAlumno+"-"+nombre;
    
        
    }
    
}
