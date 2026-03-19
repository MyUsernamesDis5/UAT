package Vista;

import javax.swing.*;

public class Vejercicioclase02 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panelprincipal;
    private JComboBox<String> comboBox;
    private JList<String> listadesplegable;
    private JScrollPane scrollPane;
    private JTextField Tdato;
    private JButton Bagregar;
    private JButton Beliminar;
    private JButton Bsalir;

    public Vejercicioclase02() {
        setTitle("Ejercicio de Clase 02");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelprincipal = new JPanel();
        panelprincipal.setLayout(null);
        setContentPane(panelprincipal);

        Tdato = new JTextField();
        Tdato.setBounds(30, 20, 150, 25);
        panelprincipal.add(Tdato);

        Bagregar = new JButton("Agregar");
        Bagregar.setBounds(200, 20, 100, 25);
        panelprincipal.add(Bagregar);

        Beliminar = new JButton("ELIMINAR");
        Beliminar.setBounds(200, 60, 100, 25);
        panelprincipal.add(Beliminar);

        Bsalir = new JButton("Salida");
        Bsalir.setBounds(200, 100, 100, 25);
        panelprincipal.add(Bsalir);

        comboBox = new JComboBox<String>();
        comboBox.setBounds(30, 60, 150, 25);
        panelprincipal.add(comboBox);

        listadesplegable = new JList<String>();
        scrollPane = new JScrollPane(listadesplegable);
        scrollPane.setBounds(30, 100, 150, 200);
        panelprincipal.add(scrollPane);
    }

    public JList<String> getListadesplegable() { return this.listadesplegable; }
    public JComboBox<String> getComboBox() { return this.comboBox; }
    public JTextField getTdato() { return this.Tdato; }
    public JButton getBagregar() { return this.Bagregar; }
    public JButton getBeliminar() { return this.Beliminar; }
    public JButton getBsalir() { return this.Bsalir; }
    
    public void limpiarText() {
        this.Tdato.setText("");
    }
}