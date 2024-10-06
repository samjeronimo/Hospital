package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {
        
    public static HashMap<String, String> validarDatos(String user, String password){

        ArrayList<DoctorGeneral> doctores = DataDoctores.listaDoctores();
        
        for (DoctorGeneral infoDoctor : doctores){
            
            if (infoDoctor.getCorreo().equalsIgnoreCase(user) || infoDoctor.getUser().equalsIgnoreCase(user)) {
                if (infoDoctor.getContrasenna().equalsIgnoreCase(password)){
                    
                    HashMap<String, String > datosDoctor = new HashMap<>();
                    datosDoctor.put("Nombre", infoDoctor.getNombre());
                    datosDoctor.put("Especialidad", infoDoctor.getCargo());
                    datosDoctor.put("Contraseña", infoDoctor.getContrasenna());
                    datosDoctor.put("Correo", infoDoctor.getCorreo());
                    datosDoctor.put("Usuario", infoDoctor.getUser());

                    System.out.println(datosDoctor.entrySet());
                    return datosDoctor;
                }
            }
        }
        
        HashMap<String , String> datosDoctor = new HashMap<>();
        datosDoctor.put("Error", "¡ERROR! verifiue usuario o contraseña");
        System.out.println(datosDoctor.get("Error"));
        
        return datosDoctor;
    }
}