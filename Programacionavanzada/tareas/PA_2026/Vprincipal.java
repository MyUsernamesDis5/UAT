package PA_2026;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class Vprincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMenuItem miSalida;
	private JMenuItem miObras;

	public Vprincipal(String titulo) {

		setTitle(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 494);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mGestionObra = new JMenu("Gestión de Obras");
		menuBar.add(mGestionObra);

		miObras = new JMenuItem("Obras");
		mGestionObra.add(miObras);

		JMenu mSalida = new JMenu("Salida");
		menuBar.add(mSalida);

		miSalida = new JMenuItem("Salir");
		mSalida.add(miSalida);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

	public JMenuItem getMiSalida() {
		return miSalida;
	}

	public JMenuItem getMiObras() {
		return miObras;
	}
}
