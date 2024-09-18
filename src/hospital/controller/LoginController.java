package hospital.controller;

import backEnde.BackEnde;
import hospital.model.DoctorGeneral;
import hospital.view.LoginView;

import javax.swing.*;

public class LoginController {
    private LoginView loginView;
    private BackEnde Ende;

    public LoginController(LoginView loginView, BackEnde ende) {
        this.loginView = loginView;
        this.Ende = ende;
        this.loginView.addLoginListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        String use = loginView.getUser();
        JPasswordField codigo = loginView.getPass();

        DoctorGeneral doc = BackEnde.validarDatos(use, codigo);

        if (doc != null) {
            System.out.println("Estan en:");
            System.out.println("Correo: " + doc.getCorreo());
            System.out.println("Contraseña: " + doc.getContrasenna());
            System.out.println("Cargo: " + doc.getCargo());
        } else {
            System.out.println("Error: Los datos son incorrectos");
        }
    }


}