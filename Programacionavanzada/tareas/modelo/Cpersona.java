package modelo;
import java.util.Objects;

public class Cpersona {
    private String id;
    private String nombre;
    private String apellido;

    public Cpersona(String nombre, String apellido) {
        super();
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }

    public void setId(String id) { this.id = id; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellido() + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cpersona))
            return false;
        else {
            Cpersona otro = (Cpersona) obj;
            if (this.getId() != null && this.getId().compareTo(otro.getId()) == 0)
                return true;
            else
                return false;
        }
    }
}