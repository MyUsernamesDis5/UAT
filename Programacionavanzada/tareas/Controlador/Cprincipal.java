package Controlador;

import Vista.Vprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Cprincipal implements ActionListener {
    Vprincipal ventana;

    public Cprincipal() {
        ventana = new Vprincipal("Sistema de Presupuesto");
        ventana.setVisible(true);
        
        this.ventana.getMipresupuestacion().addActionListener(this);
        this.ventana.getMiobras().addActionListener(this);
        this.ventana.getMiconfiguracion().addActionListener(this);
        this.ventana.getMisalida().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.ventana.getMipresupuestacion()) {
            
            this.ventana.setEstadoMenus(false);
            
            Vista.VPractica01_Tarea02 vistaInsumos = new Vista.VPractica01_Tarea02("Gestión de Insumos");
            modelo.MInsumo modeloInsumos = new modelo.MInsumo();
            
            new Controlador.CPractica01_Tarea02(vistaInsumos, modeloInsumos);
            
            this.ventana.getEscritorio().add(vistaInsumos);
            
            utilidades.Libreria.centrarFrame(this.ventana.getEscritorio(), vistaInsumos);
            
            vistaInsumos.setVisible(true);

            vistaInsumos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                    ventana.setEstadoMenus(true); 
                }
            });
            
        } 
        else if (e.getSource() == this.ventana.getMiobras()) {
            JOptionPane.showMessageDialog(this.ventana.getEscritorio(), "Módulo de Obras en construcción...");
        } 
        else if (e.getSource() == this.ventana.getMisalida()) {
            int opcion = JOptionPane.showConfirmDialog(this.ventana.getEscritorio(), "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                this.ventana.dispose();
                System.exit(0);
            }
        }
    }
}