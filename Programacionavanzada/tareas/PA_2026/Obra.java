package PA_2026;


public class Obra {
	private String idobra;
	private String obra;
	private String fecha_inicio;
	private String fecha_fin;

	public Obra(String idobra, String obra, String fecha_inicio, String fecha_fin) {
		this.idobra = idobra;
		this.obra = obra;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public String getIdobra() {
		return idobra;
	}

	public void setIdobra(String idobra) {
		this.idobra = idobra;
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	@Override
	public String toString() {
		return idobra + " - " + obra + " (" + fecha_inicio + " / " + fecha_fin + ")";
	}
}