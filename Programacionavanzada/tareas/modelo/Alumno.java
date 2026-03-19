package modelo;

public class Alumno {
    private String matricula;
    private String nombre;   

    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    
    @Override
    public String toString() { return nombre; }
}