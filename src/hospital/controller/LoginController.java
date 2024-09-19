package hospital.controller;

import backEnde.BackEnde;
import hospital.view.LoginView;
import hospital.view.DoctorView;

import javax.swing.*;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;
    private BackEnde backEnde;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.backEnde = backEnde;
        this.loginView.addLoginListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        String use = loginView.getUser();
        JPasswordField codigo = loginView.getPass();

        BackEnde credenciales = new BackEnde();
        HashMap<String, String > doctores = credenciales.validarDatos(use, codigo);

        if (!doctores.containsKey("Error")){
            System.out.println("Error: " + doctores.get("Error"));
        }else {
            String Doctor = doctores.get("Nombre");
            String especialidad = doctores.get("Especialidad");

            HashMap<String, String> loginDoctor = new HashMap<>();
            loginDoctor.put("Nombre", Doctor);
            loginDoctor.put("Especialidad", especialidad);

            new DoctorView(doctores);
        }
    }


}