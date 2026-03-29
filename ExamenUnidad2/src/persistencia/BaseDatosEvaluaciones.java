package persistencia;

import java.util.List;

import modelo.Evaluacion;

public class BaseDatosEvaluaciones {

    private List<Evaluacion> evaluaciones;

    public BaseDatosEvaluaciones() {
    }

    public BaseDatosEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
}