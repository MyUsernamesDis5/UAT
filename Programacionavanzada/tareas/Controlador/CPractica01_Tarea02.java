package Controlador;

import modelo.Insumo;
import modelo.MInsumo;
import Vista.VPractica01_Tarea02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CPractica01_Tarea02 implements ActionListener {
    private VPractica01_Tarea02 vista;
    private MInsumo modelo; 
    
    public CPractica01_Tarea02(VPractica01_Tarea02 vista, MInsumo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.getComoCategoria().setModel(this.modelo.getComboCategorias());
        this.vista.getLista().setModel(this.modelo.getListaInsumos());

        this.vista.getBagregar().addActionListener(this);
        this.vista.getBeliminar().addActionListener(this);
        this.vista.getBsalir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBagregar()) {
            String id = vista.getTid().getText().trim();
            String nombre = vista.getTinsumo().getText().trim();
            String categoria = (String) vista.getComoCategoria().getSelectedItem();

            if (id.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Llene todos los campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                modelo.agregarInsumo(new Insumo(id, nombre, categoria));
                vista.limpiarText();
                vista.getTid().requestFocus();
            }
        } 
        else if (e.getSource() == vista.getBeliminar()) {
            int index = vista.getLista().getSelectedIndex();
            if (index < 0) {
                JOptionPane.showMessageDialog(vista, "Seleccione un insumo.");
            } else {
                modelo.eliminarInsumo(index);
            }
        } 
        else if (e.getSource() == vista.getBsalir()) {
            vista.dispose(); 
        }
    }
}