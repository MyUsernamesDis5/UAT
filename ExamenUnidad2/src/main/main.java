package main;

import controlador.CEvaluacion;
import persistencia.EvaluacionPersistencia;
import vista.VEvaluacion;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Sistema de Evaluacion de Atributos de Egreso");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 720);
            frame.setLocationRelativeTo(null);

            JDesktopPane desktop = new JDesktopPane();
            desktop.setBackground(new Color(60, 90, 130));
            frame.setContentPane(desktop);

            VEvaluacion vista = new VEvaluacion();
            EvaluacionPersistencia persistencia = new EvaluacionPersistencia();
            new CEvaluacion(vista, persistencia);

            desktop.add(vista);
            vista.setVisible(true);

            frame.setVisible(true);
        });
    }
}
