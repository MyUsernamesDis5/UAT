package Vista;

import javax.swing.*;
import java.awt.*;

public class Vprincipal extends JFrame {
    private JMenuBar menuBar;
    private JMenu mGestionPresupuesto;
    private JMenu mGestionObra;
    private JMenu mReportes;
    private JMenu msalida;
    
    private JMenuItem mipresupuestacion;
    private JMenuItem miobras;
    private JMenuItem miconfiguracion;
    private JMenuItem misalida;
    
    private JDesktopPane escritorio;

    public Vprincipal(String titulo) {
        setTitle(titulo);
        setSize(800, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // --- BARRA DE MENÚS ---
        menuBar = new JMenuBar();
        
        mGestionPresupuesto = new JMenu("Gestion de Presupuesto");
        mipresupuestacion = new JMenuItem("Presupuestación");
        mGestionPresupuesto.add(mipresupuestacion);
        
        mGestionObra = new JMenu("Gestion de Obras");
        miobras = new JMenuItem("Obras");
        miconfiguracion = new JMenuItem("Configuracion");
        mGestionObra.add(miobras);
        mGestionObra.add(miconfiguracion);
        
        mReportes = new JMenu("Reportes"); 
        
        msalida = new JMenu("Salida");
        misalida = new JMenuItem("Salida");
        msalida.add(misalida);

        menuBar.add(mGestionPresupuesto);
        menuBar.add(mGestionObra);
        menuBar.add(mReportes);
        menuBar.add(msalida);
        
        setJMenuBar(menuBar);

        escritorio = new JDesktopPane();
        escritorio.setBackground(Color.GRAY); 
        setContentPane(escritorio);
    }

    public JMenuItem getMipresupuestacion() { return mipresupuestacion; }
    public JMenuItem getMiobras() { return miobras; }
    public JMenuItem getMiconfiguracion() { return miconfiguracion; }
    public JMenuItem getMisalida() { return misalida; }
    public JDesktopPane getEscritorio() { return escritorio; }

    public void setEstadoMenus(boolean estado) {
        this.mGestionPresupuesto.setEnabled(estado);
        this.mGestionObra.setEnabled(estado);
        this.mReportes.setEnabled(estado);
        this.msalida.setEnabled(estado);
    }
}