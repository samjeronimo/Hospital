package hospital.services;

import hospital.model.DoctorGeneral;

import javax.swing.*;
import java.util.ArrayList;

public class DataDoctores {

    private static ArrayList<DoctorGeneral> datos;

    public DataDoctores() {
        datos = new ArrayList<>();

        datos.add(new DoctorGeneral("Dr. Juan", "juanito@gmail.com", "cirujano", "Juan", "osos12"));
        datos.add(new DoctorGeneral("Dra. Ana", "anita@gmail.com", "pediatra", "Ana", "gato123"));
        datos.add(new DoctorGeneral("Dr. Pedro", "pedrito@gmail.com", "cirujano", "Pedro", "perro23"));
        datos.add(new DoctorGeneral("Dra. Maria", "maria@gmail.com", "cirujana", "Maria", "pollo32"));
        datos.add(new DoctorGeneral("Dr. Wicho", "whichito@gmail.com", "Neurologo", "Luis", "pato08"));
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