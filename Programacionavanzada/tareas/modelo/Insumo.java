package modelo;

public class Insumo {
    private String id;
    private String insumo;
    private String categoria;

    public Insumo(String id, String insumo, String categoria) {
        this.id = id;
        this.insumo = insumo;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public String getInsumo() { return insumo; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return this.id + " - " + this.insumo + " - " + this.categoria;
    }
}