package main;

import controlador.*;
import modelo.GestionProd;
import persistencia.GestorCSV;
import vista.*;

public class Main {
    public static void main(String[] args) {
        
        GestionProd gestionProd = new GestionProd();
        GestorCSV csv = new GestorCSV();
        gestionProd.setLista(csv.importarCSV());

        Vprincipal mdi = new Vprincipal();
        Vproducto vistaProd = new Vproducto();
        Vinventario vistaInv = new Vinventario();
        Vpuntoventa vistaVenta = new Vpuntoventa();
        Vproveedores vistaProv = new Vproveedores();
        Vreporte vistaRep = new Vreporte();

        Cproducto ctrlProd = new Cproducto(mdi, vistaProd, gestionProd, csv);
        Cinventario ctrlInv = new Cinventario(mdi, vistaInv, gestionProd, csv);
        Cpuntoventa ctrlVenta = new Cpuntoventa(mdi, vistaVenta, gestionProd, csv);
        
        
        Creporte ctrlRep = new Creporte(vistaRep, gestionProd);
        
        Cprincipal ctrlPrincipal = new Cprincipal(mdi, vistaProd, vistaInv, vistaProv, vistaVenta, vistaRep);

        mdi.setVisible(true);
    }
}