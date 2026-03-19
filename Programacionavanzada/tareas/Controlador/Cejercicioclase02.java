package Controlador;

import modelo.Mejercicio02;
import Vista.Vejercicioclase02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Cejercicioclase02 implements ActionListener {
    Vejercicioclase02 vista;
    Mejercicio02 modelo;

    public Cejercicioclase02() {
        vista = new Vejercicioclase02();
        modelo = new Mejercicio02();
        
        this.vista.getComboBox().setModel(modelo.getListacombo());
        this.vista.getListadesplegable().setModel(modelo.getLista());
        
        this.vista.getBagregar().addActionListener(this);
        this.vista.getBeliminar().addActionListener(this);
        this.vista.getBsalir().addActionListener(this);
        
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBagregar()) {
            String dato = vista.getTdato().getText().trim();
            if (!dato.isEmpty()) {
                modelo.AgregarCombo(dato);
                modelo.AgregarLista(dato);
                vista.limpiarText();
            }
        } 
        else if (e.getSource() == vista.getBeliminar()) {
            int s1 = vista.getComboBox().getSelectedIndex();
            int s2 = vista.getListadesplegable().getSelectedIndex();
            
            if ((s1 < 0) && (s2 < 0)) {
                JOptionPane.showMessageDialog(null, "¡Selecciona un elemento para eliminar!");
            } else {
                if (s1 >= 0) modelo.EliminarCombo(s1);
                if (s2 >= 0) modelo.EliminarLista(s2);
            }
        } 
        else if (e.getSource() == vista.getBsalir()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "¡Gracias por continuar con nosotros!");
            }
        }
    }
}