package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;

public class BackEnde {

    private DataDoctores dataDoctores;

    public BackEnde(DataDoctores dataDoctores) {
        this.dataDoctores = dataDoctores;
    }

    public DoctorGeneral validarDatos(String usuario, String contrasena) {
        return DataDoctores.login(usuario, contrasena);
    }
}