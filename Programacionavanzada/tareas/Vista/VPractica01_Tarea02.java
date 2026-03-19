package Vista;

import javax.swing.*;
import java.beans.PropertyVetoException;

public class VPractica01_Tarea02 extends JInternalFrame {
    private static final long serialVersionUID = 1L;
    private JTextField Tid;
    private JTextField Tinsumo;
    private JComboBox<String> ComoCategoria;
    private JList<String> lista;
    private JButton Bagregar;
    private JButton Beliminar;
    private JButton Bsalir;

    public VPractica01_Tarea02(String titulo) {
        super(titulo, false, true, false, true); 
        setSize(480, 400);
        setLayout(null);

        // --- ETIQUETAS Y CAMPOS (Igual a la Tarea 01) ---
        JLabel labelId = new JLabel("ID:");
        labelId.setBounds(20, 20, 80, 25);
        add(labelId);

        Tid = new JTextField();
        Tid.setBounds(100, 20, 150, 25);
        add(Tid);

        JLabel labelInsumo = new JLabel("Insumo:");
        labelInsumo.setBounds(20, 60, 80, 25);
        add(labelInsumo);

        Tinsumo = new JTextField();
        Tinsumo.setBounds(100, 60, 150, 25);
        add(Tinsumo);

        JLabel labelCategoria = new JLabel("Categoría:");
        labelCategoria.setBounds(20, 100, 80, 25);
        add(labelCategoria);

        ComoCategoria = new JComboBox<>();
        ComoCategoria.setBounds(100, 100, 150, 25);
        add(ComoCategoria);

        Bagregar = new JButton("Agregar");
        Bagregar.setBounds(20, 150, 100, 25);
        add(Bagregar);

        Beliminar = new JButton("Eliminar");
        Beliminar.setBounds(130, 150, 100, 25);
        add(Beliminar);

        Bsalir = new JButton("Salir");
        Bsalir.setBounds(240, 150, 100, 25);
        add(Bsalir);

        lista = new JList<>();
        JScrollPane scrollPane = new JScrollPane(lista);
        scrollPane.setBounds(20, 190, 420, 150);
        add(scrollPane);
    }

    public void maximizarFrame() {
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException e) {
            System.out.println("Error al maximizar: " + e.getMessage());
        }
    }

    public JTextField getTid() { return Tid; }
    public JTextField getTinsumo() { return Tinsumo; }
    public JComboBox<String> getComoCategoria() { return ComoCategoria; }
    public JList<String> getLista() { return lista; }
    public JButton getBagregar() { return Bagregar; }
    public JButton getBeliminar() { return Beliminar; }
    public JButton getBsalir() { return Bsalir; }

    public void limpiarText() {
        Tid.setText("");
        Tinsumo.setText("");
    }
}