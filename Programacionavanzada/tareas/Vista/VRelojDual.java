package Vista;
import javax.swing.*;
import java.awt.*;

public class VRelojDual extends JFrame {

    private JTextField tTiempoCorriendo;
    private JTextField tTiempoTotal;
    private JButton bIniciarDetener;
    private JButton bReiniciar;
    private JButton bSalida;

    public VRelojDual() {
        setTitle("Cronómetro Dual");
        setSize(520, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(190, 225, 235));

        bIniciarDetener = new JButton("Iniciar");
        bReiniciar = new JButton("Reiniciar");
        bSalida = new JButton("Salir");

        JLabel lbl1 = new JLabel("Tiempo Corriendo:");
        JLabel lbl2 = new JLabel("Tiempo Total:");

        tTiempoCorriendo = new JTextField("00:00:00");
        tTiempoTotal = new JTextField("00:00:00");

        tTiempoCorriendo.setEditable(false);
        tTiempoTotal.setEditable(false);

        bIniciarDetener.setBounds(40, 40, 120, 30);
        bReiniciar.setBounds(40, 80, 120, 30);
        bSalida.setBounds(40, 120, 120, 30);

        lbl1.setBounds(190, 45, 140, 25);
        lbl2.setBounds(190, 85, 140, 25);

        tTiempoCorriendo.setBounds(330, 45, 140, 25);
        tTiempoTotal.setBounds(330, 85, 140, 25);

        add(bIniciarDetener);
        add(bReiniciar);
        add(bSalida);
        add(lbl1);
        add(lbl2);
        add(tTiempoCorriendo);
        add(tTiempoTotal);
    }

    public void setTiempoCorriendo(String s) {
        tTiempoCorriendo.setText(s);
    }

    public void setTiempoTotal(String s) {
        tTiempoTotal.setText(s);
    }

    public JButton getbIniciarDetener() {
        return bIniciarDetener;
    }

    public JButton getbReiniciar() {
        return bReiniciar;
    }

    public JButton getbSalida() {
        return bSalida;
    }
}