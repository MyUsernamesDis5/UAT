package vista;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Vproducto extends JInternalFrame {

    private static final long serialVersionUID = 1L;

    public JTextField txtSku, txtNombre, txtPrecioCompra, txtPorcentajeGanancia, txtPrecioVenta, txtCantidad;
   
    public JComboBox<String> comboUnidad, comboCategoriaPrincipal, comboSubCategoria;
    
    public JLabel lblFoto;
    public JButton btnCargarFoto;
    public String rutaFotoActual = "sin_foto.png"; 
    
    public JButton btnGuardar, btnBuscar, btnModificar, btnEliminar, btnLimpiar;
    
    public JTable tablaProductos;
    public DefaultTableModel modeloTabla;

    public Vproducto() {
        super("Catálogo de Productos", true, true, true, true);
        setSize(950, 600);
        setLayout(new BorderLayout(10, 10));

        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        
        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Producto"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0; panelFormulario.add(new JLabel("Código (SKU):"), gbc);
        gbc.gridx = 1; txtSku = new JTextField(15); panelFormulario.add(txtSku, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panelFormulario.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; txtNombre = new JTextField(15); panelFormulario.add(txtNombre, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panelFormulario.add(new JLabel("Cat. Principal:"), gbc);
        gbc.gridx = 1; 
        String[] cats = {"Despensa Básica", "Lácteos y Huevo", "Bebidas y Líquidos", "Botanas y Dulces", "Frutas y Verduras", "Carnes y Salchichonería", "Cuidado del Hogar", "Cuidado Personal", "Alimentos Preparados"};
        comboCategoriaPrincipal = new JComboBox<>(cats);
        panelFormulario.add(comboCategoriaPrincipal, gbc);

        gbc.gridx = 0; gbc.gridy = 3; panelFormulario.add(new JLabel("Sub Categoría:"), gbc);
        gbc.gridx = 1; 
        comboSubCategoria = new JComboBox<>(new String[]{"General", "Refrescos", "Galletas", "Lácteos", "Limpieza"}); 
        panelFormulario.add(comboSubCategoria, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panelFormulario.add(new JLabel("Unidad Medida:"), gbc);
        gbc.gridx = 1; 
        comboUnidad = new JComboBox<>(new String[]{"Pza", "Kg", "Lts", "Caja"});
        panelFormulario.add(comboUnidad, gbc);

        gbc.gridx = 0; gbc.gridy = 5; panelFormulario.add(new JLabel("Cant. Almacén:"), gbc);
        gbc.gridx = 1; txtCantidad = new JTextField(15); panelFormulario.add(txtCantidad, gbc);

        gbc.gridx = 0; gbc.gridy = 6; panelFormulario.add(new JLabel("Precio Compra ($):"), gbc);
        gbc.gridx = 1; txtPrecioCompra = new JTextField(15); panelFormulario.add(txtPrecioCompra, gbc);

        gbc.gridx = 0; gbc.gridy = 7; panelFormulario.add(new JLabel("Ganancia (%):"), gbc);
        gbc.gridx = 1; txtPorcentajeGanancia = new JTextField(15); txtPorcentajeGanancia.setText("30"); 
        panelFormulario.add(txtPorcentajeGanancia, gbc);

        gbc.gridx = 0; gbc.gridy = 8; panelFormulario.add(new JLabel("Precio Venta ($):"), gbc);
        gbc.gridx = 1; txtPrecioVenta = new JTextField(15); 
        txtPrecioVenta.setEditable(false); 
        txtPrecioVenta.setBackground(new Color(255, 255, 200)); 
        panelFormulario.add(txtPrecioVenta, gbc);

        JPanel panelFoto = new JPanel(new BorderLayout());
        panelFoto.setBorder(BorderFactory.createTitledBorder("Fotografía del Producto"));
        lblFoto = new JLabel("Sin Imagen", SwingConstants.CENTER);
        lblFoto.setPreferredSize(new Dimension(150, 150));
        lblFoto.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        btnCargarFoto = new JButton("Seleccionar Foto");
        
        panelFoto.add(lblFoto, BorderLayout.CENTER);
        panelFoto.add(btnCargarFoto, BorderLayout.SOUTH);

        panelIzquierdo.add(panelFormulario, BorderLayout.CENTER);
        panelIzquierdo.add(panelFoto, BorderLayout.SOUTH);

    
        JPanel panelDerecho = new JPanel(new BorderLayout());
        
        String[] columnas = {"SKU", "Nombre", "P.Compra", "Ganancia%", "P.Venta", "Cant", "Unidad", "Categoría"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modeloTabla);
        panelDerecho.add(new JScrollPane(tablaProductos), BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnModificar = new JButton("Modificar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");
        
        panelBotones.add(btnGuardar);
        panelBotones.add(btnBuscar);
        panelBotones.add(btnModificar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);
        
        panelDerecho.add(panelBotones, BorderLayout.SOUTH);

        add(panelIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.CENTER);
    }
}