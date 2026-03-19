package Vista;
import javax.swing.*;

public class Vejercicioclase01 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel PanelPrincipal;
    private JTextField T1;
    private JTextField T2;
    private JButton Bsalir;
    private JButton Bagregar;
    private JTextArea Tr;

    public Vejercicioclase01() {
        setTitle("Ejercicio de Clase 01");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(null);
        setContentPane(PanelPrincipal);

        JLabel lblNombre = new JLabel("Nombre Profesor");
        lblNombre.setBounds(20, 20, 120, 20);
        PanelPrincipal.add(lblNombre);

        T1 = new JTextField();
        T1.setBounds(150, 20, 120, 20);
        PanelPrincipal.add(T1);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(20, 60, 120, 20);
        PanelPrincipal.add(lblApellido);

        T2 = new JTextField();
        T2.setBounds(150, 60, 120, 20);
        PanelPrincipal.add(T2);

        Bagregar = new JButton("Agregar");
        Bagregar.setBounds(300, 20, 100, 20);
        PanelPrincipal.add(Bagregar);

        Bsalir = new JButton("Salir");
        Bsalir.setBounds(300, 60, 100, 20);
        PanelPrincipal.add(Bsalir);

        Tr = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(Tr);
        scrollPane.setBounds(20, 100, 380, 140);
        PanelPrincipal.add(scrollPane);
    }

    public String getT1() { return this.T1.getText(); }
    public String getT2() { return this.T2.getText(); }
    public void setT1(String texto) { this.T1.setText(texto); }
    public void setT2(String texto) { this.T2.setText(texto); }
    public void setTr(String texto) { this.Tr.setText(texto); }
    public JButton bsalir() { return this.Bsalir; }
    public JButton bagregar() { return this.Bagregar; }
    public void limparText() {
        this.T1.setText("");
        this.T2.setText("");
    }
}