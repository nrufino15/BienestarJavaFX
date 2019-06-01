package sample.Controllers;

import java.io.Serializable;
import java.util.Date;

public class Datos implements Serializable {
    private String date;
    private String stateOfTheDay;
    private String eAnimo;
    private String eFisico;
    private String comida;

    public Datos(String date, String stateOfTheDay, String eAnimo, String eFisico, String comida) {
        this.date = date;
        this.stateOfTheDay = stateOfTheDay;
        this.eAnimo = eAnimo;
        this.eFisico = eFisico;
        this.comida = comida;
    }

    public String toString() {
        return date + "," + stateOfTheDay + "," + eAnimo + "," + eFisico + "," + comida;
    }
}
