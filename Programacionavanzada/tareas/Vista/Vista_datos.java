package Vista;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.Asignatura;
import modelo.Carrera;
import modelo.Materias;

public class Vista_datos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	
	// Declaramos las 3 listas usando Generics para que coincidan con tus objetos del Modelo
	private JList<Carrera> listacarrera;
	private JList<Materias> listamateria;
	private JList<Asignatura> listaAsignatura;

	public Vista_datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600); // Ventana amplia para que quepan todos los datos
		setTitle("Sistema de Consulta de Calificaciones");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10)); // Separación entre elementos
		
		// =======================================================
		// PANEL SUPERIOR: Contendrá las 3 listas (CARRERAS, MATERIAS, ASIGNATURAS)
		// =======================================================
		JPanel panelListas = new JPanel();
		panelListas.setLayout(new GridLayout(1, 3, 15, 0)); // 1 fila, 3 columnas
		contentPane.add(panelListas, BorderLayout.NORTH);
		
		// 1. Lista de Carreras
		listacarrera = new JList<>();
		listacarrera.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollCarrera = new JScrollPane(listacarrera);
		scrollCarrera.setBorder(new TitledBorder("1. Seleccione una Carrera:"));
		panelListas.add(scrollCarrera);
		
		// 2. Lista de Materias
		listamateria = new JList<>();
		listamateria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollMateria = new JScrollPane(listamateria);
		scrollMateria.setBorder(new TitledBorder("2. Seleccione una Materia:"));
		panelListas.add(scrollMateria);
		
		// 3. Lista de Asignaturas (Grupos y Profesores)
		listaAsignatura = new JList<>();
		listaAsignatura.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollAsignatura = new JScrollPane(listaAsignatura);
		scrollAsignatura.setBorder(new TitledBorder("3. Seleccione Profesor y Grupo:"));
		panelListas.add(scrollAsignatura);
		
		
		// =======================================================
		// PANEL CENTRAL: Contendrá la tabla de los alumnos
		// =======================================================
		JScrollPane scrollTable = new JScrollPane();
		contentPane.add(scrollTable, BorderLayout.CENTER);
		
		table = new JTable();
		// Evitamos que el usuario pueda editar las celdas dándoles doble clic
		table.setDefaultEditor(Object.class, null); 
		scrollTable.setViewportView(table);
	}

	// =======================================================
	// GETTERS (Necesarios para que el Controlador pueda modificarlos)
	// =======================================================
	public JTable getTable() {
		return table;
	}

	public JList<Carrera> getListacarrera() {
		return listacarrera;
	}

	public JList<Materias> getListamateria() {
		return listamateria;
	}

	public JList<Asignatura> getListaAsignatura() {
		return listaAsignatura;
	}
}