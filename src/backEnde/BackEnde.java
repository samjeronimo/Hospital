package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;
import hospital.view.DoctorView;

import javax.swing.*;
import java.util.HashMap;

public class BackEnde {
    public HashMap<String, String> validarDatos(String usuario, JPasswordField contrasena){
        DataDoctores dataDoctores1 = new DataDoctores();
        HashMap<String, String> doctores = new HashMap<>();

        DoctorGeneral doc = dataDoctores1.login(usuario, contrasena);

        if (doctores != null){

            doctores.put("Nombre", doc.getNombre());
            doctores.put("Correo", doc.getContrasenna());
            doctores.put("Especialidad", doc.getCargo());
        }else {
            doctores.put("ERROR", "ERROR");
            return doctores;
        }
        return doctores;
    }
}