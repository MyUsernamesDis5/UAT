package modelo;
import java.util.Objects;

public class Carrera {
    String carrera;

    public Carrera() {
        this.carrera = "";
    }

    public void setCarrera(String carrera) { this.carrera = carrera; }
    public String getCarrera() { return carrera; }

    @Override
    public String toString() { return this.getCarrera(); }

    @Override
    public int hashCode() { return Objects.hash(carrera); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carrera other = (Carrera) obj;
        return Objects.equals(carrera, other.carrera);
    }
}