package hospital.controller;

import backEnde.BackEnde;
import hospital.model.DoctorGeneral;
import hospital.view.LoginView;

public class LoginController {
    private LoginView loginView;
    private BackEnde Ende;

    public LoginController(LoginView loginView, BackEnde ende) {
        this.loginView = loginView;
        this.Ende = ende;
        this.loginView.addActionListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        String use = loginView.getCorreo();
        String codigo = loginView.getContrasena();

        DoctorGeneral doc = backEnde.validarDatos(use, codigo);

        if (doc != null) {
            System.out.println("Estan en:");
            System.out.println("Correo: " + doc.getCorreo());
            System.out.println("Contraseña: " + doc.getContrasena());
            System.out.println("Cargo: " + doc.getCargo());
        } else {
            System.out.println("Error: Los datos son incorrectos");
        }
    }


}