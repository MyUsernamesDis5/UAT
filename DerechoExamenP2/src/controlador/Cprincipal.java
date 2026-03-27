package controlador;

import vista.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cprincipal implements ActionListener {
    
    private Vprincipal mdi;
    private Vproducto vistaProd;
    private Vinventario vistaInv;
    private Vproveedores vistaProv;
    private Vpuntoventa vistaVenta;
    private Vreporte vistaRep;

    public Cprincipal(Vprincipal mdi, Vproducto vistaProd, Vinventario vistaInv, 
                                Vproveedores vistaProv, Vpuntoventa vistaVenta, Vreporte vistaRep) {
        this.mdi = mdi;
        this.vistaProd = vistaProd;
        this.vistaInv = vistaInv;
        this.vistaProv = vistaProv;
        this.vistaVenta = vistaVenta;
        this.vistaRep = vistaRep;

       
        this.mdi.menuProductos.addActionListener(this);
        this.mdi.menuInventario.addActionListener(this);
        this.mdi.menuProveedores.addActionListener(this);
        this.mdi.menuPuntoVenta.addActionListener(this);
        this.mdi.menuReportes.addActionListener(this);
        this.mdi.menuUnidadesMedida.addActionListener(this);
        this.mdi.menuSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdi.menuProductos) abrirVentana(vistaProd);
        else if (e.getSource() == mdi.menuInventario) abrirVentana(vistaInv);
        else if (e.getSource() == mdi.menuProveedores) abrirVentana(vistaProv);
        else if (e.getSource() == mdi.menuPuntoVenta) abrirVentana(vistaVenta);
        else if (e.getSource() == mdi.menuReportes) abrirVentana(vistaRep);
        else if (e.getSource() == mdi.menuUnidadesMedida) {
            JOptionPane.showMessageDialog(mdi, "Unidades de Medida configuradas en el sistema: Pza, Kg, Lts, Caja.");
        }
        else if (e.getSource() == mdi.menuSalir) {
            System.exit(0); 
        }
    }

    private void abrirVentana(JInternalFrame ventana) {
        if (!ventana.isVisible()) {
            mdi.escritorio.add(ventana);
            ventana.setVisible(true);
            try { ventana.setSelected(true); } catch (Exception ex) { }
        } else {
            ventana.toFront();
        }
    }
}