/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp.modelo;

/**
 *
 * @author Agustin
 */
public class Cursada {
    private int idCursada=-1;   
    private Materia idMateria;
    private Alumno idAlumno;
    private double nota;
    
    public Cursada(Materia idMateria, Alumno idAlumno, double nota) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }
        
    public Cursada(int idCursada, Materia idMateria, Alumno idAlumno, double nota) {
        this.idCursada = idCursada;
        this.idMateria = idMateria;
        this.idAlumno = idAlumno;        
        this.nota = nota;
    }

    public Cursada(){}
    
    public int getId() {
        return idCursada;
    }

    public void setId(int idCursada) {
        this.idCursada = idCursada;
    }

    public Alumno getAlumno() {
        return idAlumno;
    }

    public void setAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materia getMateria() {
        return idMateria;
    }

    public void setMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
  

    
    
    
    
}
