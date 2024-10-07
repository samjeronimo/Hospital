package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {

   public static HashMap<String, String> validarDatos(String user, String password){

       ArrayList<DoctorGeneral> doctores = DataDoctores.listaDoctores();

       for (DoctorGeneral infoDoctor : doctores){

           if (infoDoctor.getCorreo().equalsIgnoreCase(user) || infoDoctor.getUser().equalsIgnoreCase(user)){
               if (infoDoctor.getContrasenna().equalsIgnoreCase(password)){

                   HashMap<String, String> datosDoctores = new HashMap<>();
                   datosDoctores.put("Nombre", infoDoctor.getNombre());
                   datosDoctores.put("Especialidad", infoDoctor.getCargo());
                   datosDoctores.put("Contraseña", infoDoctor.getContrasenna());
                   datosDoctores.put("Usuario", infoDoctor.getUser());
                   datosDoctores.put("Correo", infoDoctor.getCorreo());

                   System.out.println(datosDoctores.entrySet());
                   return datosDoctores;
               }
           }
       }

       HashMap<String, String> datosDoctor = new HashMap<>();
       datosDoctor.put("Error", "¡ERROR!");
       System.out.println(datosDoctor.get("ERROR"));

       return datosDoctor;
   }
}