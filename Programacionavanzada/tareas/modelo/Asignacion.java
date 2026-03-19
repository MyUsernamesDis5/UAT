package modelo;

public class Asignacion {
    private Asignatura materia;
    private Profesor profesor;
    private String grupo;      
    private String periodo;    
    private Alumno alumno;      
    private Carrera carrera;

    public Asignacion(Asignatura materia, Profesor profesor, String grupo, String periodo, Alumno alumno, Carrera carrera) {
        this.materia = materia;
        this.profesor = profesor;
        this.grupo = grupo;
        this.periodo = periodo;
        this.alumno = alumno;
        this.carrera = carrera;
    }

    // Getters
    public Asignatura getMateria() { return materia; }
    public Profesor getProfesor() { return profesor; }
    public String getGrupo() { return grupo; }
    public String getPeriodo() { return periodo; }
    public Alumno getAlumno() { return alumno; }
    public Carrera getCarrera() { return carrera; }
}