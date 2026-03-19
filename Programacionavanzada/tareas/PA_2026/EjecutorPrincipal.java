package PA_2026;

import Controlador.Cprincipal;

public class EjecutorPrincipal {
    public static void main(String[] args) {
        try {
            new Cprincipal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}