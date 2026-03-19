package modelo;

public class Profesor {
    private String nombre; 

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() { return nombre; }
}