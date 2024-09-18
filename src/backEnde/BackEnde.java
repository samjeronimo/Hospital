package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;

import javax.swing.*;

public class BackEnde {

    private DataDoctores dataDoctores;

    public BackEnde(DataDoctores dataDoctores) {
        this.dataDoctores = dataDoctores;
    }

    public static DoctorGeneral validarDatos(String usuario, JPasswordField contrasena) {
        return DataDoctores.login(usuario, contrasena);
    }
}