package PA_2026;

import java.util.ArrayList;

public class Lobra {

	private ArrayList<Obra> lista;

	public Lobra() {
		lista = new ArrayList<Obra>();
	}

	public boolean Insertar(Obra nodo) {
		return lista.add(nodo);
	}

	public boolean Eliminar(String idobra) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getIdobra().compareTo(idobra) == 0) {
				lista.remove(i);
				return true;
			}
		}
		return false;
	}

	public void Modificar(int pos, Obra nodo) {
		if (pos >= 0 && pos < lista.size()) {
			lista.set(pos, nodo);
		}
	}

	public String MostrarLista() {

		String salida = "";

		for (int i = 0; i < lista.size(); i++) {
			salida = salida + lista.get(i).toString() + "\n";
			
		}

		return salida;
	}

	public String idsiguiente(String idactual) {

		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i).getIdobra().compareTo(idactual) == 0) {
				return lista.get(i + 1).getIdobra();
			}
		}
		return "";
	}
}
