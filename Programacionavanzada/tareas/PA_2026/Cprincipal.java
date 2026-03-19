package PA_2026;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cprincipal implements ActionListener {

	private Vprincipal vista;
	private Lobra listaObras;

	public Cprincipal() {

		listaObras = new Lobra();
		vista = new Vprincipal("Sistema de Presupuestos");

		vista.getMiSalida().addActionListener(this);
		vista.getMiObras().addActionListener(this);

		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if (src == vista.getMiSalida()) {
			vista.dispose();
		}

		if (src == vista.getMiObras()) {

			Obra o1 = new Obra("O001", "Edificio Central", "01/01/2025", "30/06/2025");
			Obra o2 = new Obra("O002", "Puente Norte", "15/02/2025", "20/08/2025");

			listaObras.Insertar(o1);
			listaObras.Insertar(o2);

			System.out.println(listaObras.MostrarLista());
		}
	}
}