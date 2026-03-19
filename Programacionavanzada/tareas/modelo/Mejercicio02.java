package modelo;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Mejercicio02 {
    private DefaultComboBoxModel<String> listacombo;
    private DefaultListModel<String> lista;
    private String[] equipos = {"America", "Patriots", "Real Madrid", "Celtics de Boston", "Yankees"};

    public Mejercicio02() {
        this.listacombo = new DefaultComboBoxModel<String>();
        this.lista = new DefaultListModel<String>();
        this.inicializarcombo();
        this.inicializarlistmodel();
    }

    private void inicializarcombo() {
        for(String dato : this.equipos) {
            listacombo.addElement(dato);
        }
    }

    private void inicializarlistmodel() {
        for(String dato : this.equipos) {
            lista.addElement(dato);
        }
    }

    public DefaultComboBoxModel<String> getListacombo() { return listacombo; }
    public DefaultListModel<String> getLista() { return lista; }
    public String[] getEquipos() { return equipos; }

    public void AgregarCombo(String info) {
        listacombo.addElement(info);
    }

    public void AgregarLista(String info) {
        lista.addElement(info);
    }

    public String EliminarCombo(int pos1) {
        String c1 = listacombo.getElementAt(pos1);
        listacombo.removeElementAt(pos1);
        return c1;
    }

    public String EliminarLista(int pos1) {
        String c1 = lista.getElementAt(pos1);
        lista.removeElementAt(pos1); // Nota: En JList moderna se usa removeElementAt
        return c1;
    }
}