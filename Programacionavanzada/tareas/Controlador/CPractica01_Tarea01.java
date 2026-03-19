package Controlador;

import modelo.Insumo;
import modelo.MInsumo;
import Vista.VPractica01_Tarea01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CPractica01_Tarea01 implements ActionListener {
    private VPractica01_Tarea01 vista;
    private MInsumo modelo;

    public CPractica01_Tarea01() {
        vista = new VPractica01_Tarea01();
        modelo = new MInsumo();

        vista.getComoCategoria().setModel(modelo.getComboCategorias());
        vista.getLista().setModel(modelo.getListaInsumos());

        vista.getBagregar().addActionListener(this);
        vista.getBeliminar().addActionListener(this);
        vista.getBsalir().addActionListener(this);

        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBagregar()) {
            String id = vista.getTid().getText().trim();
            String nombre = vista.getTinsumo().getText().trim();
            String categoria = (String) vista.getComoCategoria().getSelectedItem();

            if (id.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Error: ID e Insumo son campos obligatorios", "Validación", JOptionPane.WARNING_MESSAGE);
            } else {
                Insumo nuevo = new Insumo(id, nombre, categoria);
                modelo.agregarInsumo(nuevo);
                vista.limpiarText();
                vista.getTid().requestFocus(); // Regresa el cursor al primer campo
            }
        } 
        
        else if (e.getSource() == vista.getBeliminar()) {
            int index = vista.getLista().getSelectedIndex();
            if (index < 0) {
                JOptionPane.showMessageDialog(vista, "¡Selecciona un insumo de la lista para eliminar!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modelo.eliminarInsumo(index);
            }
        } 
        
        else if (e.getSource() == vista.getBsalir()) {
            int opcion = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea cerrar el programa?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                vista.dispose();
                System.exit(0);
            }
        }
    }
}