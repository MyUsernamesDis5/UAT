package Controlador;
import modelo.Cpersona;
import modelo.Lista;
import Vista.Vejercicioclase01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Cejercicioclase01_b implements ActionListener {
    static Vejercicioclase01 ejemplo01;
    static Lista lista;

    public Cejercicioclase01_b() {
        lista = new Lista();
        ejemplo01 = new Vejercicioclase01();
        ejemplo01.setVisible(true);
        ejemplo01.bsalir().addActionListener(this);
        ejemplo01.bagregar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ejemplo01.bsalir()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                ejemplo01.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "¡Gracias por continuar con nosotros!");
            }
        } 
        else if (e.getSource() == ejemplo01.bagregar()) {
            String nombre = ejemplo01.getT1().trim();
            String apellido = ejemplo01.getT2().trim();

            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            } else {
                Cpersona nodo = new Cpersona(nombre, apellido);
                lista.insertar(nodo);
                ejemplo01.limparText();
                ejemplo01.setTr(lista.info() + "\n.........\n");
                JOptionPane.showMessageDialog(null, "Persona agregada correctamente");
            }
        }
    }
}