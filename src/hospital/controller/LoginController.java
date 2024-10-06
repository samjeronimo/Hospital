package hospital.controller;

import backEnde.BackEnde;
import hospital.model.DoctorGeneral;
import hospital.view.DoctorView;
import hospital.view.LoginView;

import javax.swing.*;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        HashMap validar = BackEnde.validarDatos(loginView.getUser(), loginView.getName());

        DoctorView doctorView = new DoctorView();
        loginView.dispose();
    }


}