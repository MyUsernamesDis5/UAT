package modelo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla1 {
    DefaultTableModel modelo;
    String columnas[] = {"D.A.", "P.EDUCATIVO", "LETRA", "PROFESOR", "MATERIA", "Periodo Materia", "No.ACTA", "MATRICULA", "ALUMNO", "CALIFICACION", "OP.INS.", "OP.EXA.", "MES", "CICLO ESCOLAR"};
    ArrayList<String[]> datos;

    public ModeloTabla1(ArrayList<String[]> datos) {
        this.datos = datos;
        modelo = new DefaultTableModel(columnas, 0);
        for (String[] fila : datos) {
            modelo.addRow(fila);
        }
    }

    public DefaultTableModel getModelo() { return modelo; }

    public DefaultListModel<Carrera> getModeloCarreras() {
        DefaultListModel<Carrera> modeloCarreras = new DefaultListModel<>();
        ListaDeObjetos lista = new ListaDeObjetos();
        
        for (String[] fila : datos) {
            Carrera c = new Carrera();
            c.setCarrera(fila[1]); 
            if (lista.Insertar(c)) {
                modeloCarreras.addElement(c);
            }
        }
        return modeloCarreras;
    }

    public DefaultListModel<Materias> getModeloMaterias(Carrera carreraSeleccionada) {
        DefaultListModel<Materias> modeloMaterias = new DefaultListModel<>();
        ListaDeObjetos lista = new ListaDeObjetos();
        
        for (String[] fila : datos) {
            if (fila[1].equals(carreraSeleccionada.getCarrera())) {
                Materias m = new Materias(fila[4], fila[1]); 
                if (lista.Insertar(m)) {
                    modeloMaterias.addElement(m);
                }
            }
        }
        return modeloMaterias;
    }

    public DefaultListModel<Asignatura> getModeloAsignaturas(Materias materiaSeleccionada) {
        DefaultListModel<Asignatura> modeloAsignaturas = new DefaultListModel<>();
        ListaDeObjetos lista = new ListaDeObjetos();
        
        for (String[] fila : datos) {
            if (fila[4].equals(materiaSeleccionada.getMateria()) && fila[1].equals(materiaSeleccionada.getCarrera())) {
                Asignatura a = new Asignatura(fila[1], fila[4], fila[3], fila[2]);
                if (lista.Insertar(a)) {
                    modeloAsignaturas.addElement(a);
                }
            }
        }
        return modeloAsignaturas;
    }
}