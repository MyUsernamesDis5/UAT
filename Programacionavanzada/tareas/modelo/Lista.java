package modelo;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Cpersona> lista;

    public Lista() {
        this.lista = new ArrayList<Cpersona>();
    }

    public void insertar(Cpersona nodo) {
        this.lista.add(nodo);
    }

    public String info() {
        String dato = "";
        for (Cpersona nodo : this.lista) {
            dato = dato + nodo.toString();
        }
        return dato;
    }
}