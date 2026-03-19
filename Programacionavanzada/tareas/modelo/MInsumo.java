package modelo;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class MInsumo {
    private DefaultComboBoxModel<String> comboCategorias;
    private DefaultListModel<String> listaInsumos;

    public MInsumo() {
        comboCategorias = new DefaultComboBoxModel<>(new String[]{
            "Materiales", "Mano de Obra", "Herramienta", "Servicios"
        });
        listaInsumos = new DefaultListModel<>();
    }

    public DefaultComboBoxModel<String> getComboCategorias() { return comboCategorias; }
    public DefaultListModel<String> getListaInsumos() { return listaInsumos; }

    public void agregarInsumo(Insumo obj) {
        listaInsumos.addElement(obj.toString());
    }

    public void eliminarInsumo(int index) {
        if (index >= 0) {
            listaInsumos.removeElementAt(index);
        }
    }
}