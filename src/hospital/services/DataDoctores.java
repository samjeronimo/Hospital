package hospital.services;

import hospital.model.DoctorGeneral;

import javax.swing.*;
import java.util.ArrayList;

public class DataDoctores {

    private static ArrayList<DoctorGeneral> datos;

    public DataDoctores() {
        datos = new ArrayList<>();

        datos.add(new DoctorGeneral("Dr. Juan", "juanito@scl.edu.gt", "cirujano", "vafv", "osos12"));
        datos.add(new DoctorGeneral("Dra. Ana", "anita@scl.edu.gt", "pediatra", "gvdhz", "gato123"));
        datos.add(new DoctorGeneral("Dr. Pedro", "pedrito@scl.edu.gt", "cirujano", "sadvs", "perro23"));
        datos.add(new DoctorGeneral("Dra. Maria", "maria@scl.edu.gt", "cirujana", "afda", "pollo32"));
        datos.add(new DoctorGeneral("Dr. Wicho", "whichito@scl.edu.gt", "Neurologo", "vsfaaa", "pato08"));
    }

    public static DoctorGeneral login(String correo, JPasswordField contrasenna) {

        for (DoctorGeneral doctor : datos) {

            if (doctor.getCorreo().equals(correo) && doctor.getContrasenna().equals(contrasenna)) {
                return doctor;
            }
        }
        return null;
    }

}