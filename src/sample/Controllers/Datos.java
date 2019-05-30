package sample.Controllers;

import java.io.Serializable;

public class Datos implements Serializable {
    private String eAnimo;
    private String eFisico;
    private String comida;

    Datos(String eAnimo, String eFisico, String comida) {
        this.eAnimo = eAnimo;
        this.eFisico = eFisico;
        this.comida = comida;
    }

    public String toString() {
        return "Employee(" + eAnimo + "," + eFisico + "," + comida + ")";
    }
}
