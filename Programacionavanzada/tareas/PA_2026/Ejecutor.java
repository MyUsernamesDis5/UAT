package PA_2026;

import Controlador.Cejercicioclase01_b;

public class Ejecutor {
    public static void main(String[] args) {
        Cejercicioclase01_b controlador;
        try {
            controlador = new Cejercicioclase01_b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}