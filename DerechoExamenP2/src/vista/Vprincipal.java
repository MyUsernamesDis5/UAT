package vista;

import javax.swing.*;

public class Vprincipal extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    public JDesktopPane escritorio;
    
    public JMenuItem menuProductos;
    public JMenuItem menuUnidadesMedida; 
    public JMenuItem menuInventario;
    public JMenuItem menuProveedores;
    public JMenuItem menuPuntoVenta;
    public JMenuItem menuReportes;
    public JMenuItem menuSalir;

    public Vprincipal() {
        setTitle("Smart POS - Sistema de Abarrotes");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        escritorio = new JDesktopPane();
        setContentPane(escritorio);

        JMenuBar barraMenu = new JMenuBar();
        
        JMenu menuCatProductos = new JMenu("1. Catálogo de Productos");
        menuProductos = new JMenuItem("Gestión de Productos");
        menuUnidadesMedida = new JMenuItem("Configurar Unidades de Medida");
        menuCatProductos.add(menuProductos);
        menuCatProductos.addSeparator();
        menuCatProductos.add(menuUnidadesMedida);

        JMenu menuModInventario = new JMenu("2. Inventarios");
        menuInventario = new JMenuItem("Entradas y Ajustes de Almacén");
        menuModInventario.add(menuInventario);

        JMenu menuModProveedores = new JMenu("3. Proveedores");
        menuProveedores = new JMenuItem("Directorio de Proveedores");
        menuModProveedores.add(menuProveedores);

        JMenu menuModVentas = new JMenu("4. Punto de Venta");
        menuPuntoVenta = new JMenuItem("Terminal de Caja (POS)");
        menuModVentas.add(menuPuntoVenta);

        JMenu menuModReportes = new JMenu("5. Reportes");
        menuReportes = new JMenuItem("Reportes de Ventas e Inventario");
        menuModReportes.add(menuReportes);

        JMenu menuSistema = new JMenu("Sistema");
        menuSalir = new JMenuItem("Salir del Sistema");
        menuSistema.add(menuSalir);

      
        barraMenu.add(menuCatProductos);
        barraMenu.add(menuModInventario);
        barraMenu.add(menuModProveedores);
        barraMenu.add(menuModVentas);
        barraMenu.add(menuModReportes);
        barraMenu.add(menuSistema);
        
        setJMenuBar(barraMenu);
    }
}