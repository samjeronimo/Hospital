import javax.swing.*;

import backEnde.BackEnde;
import hospital.controller.LoginController;
import hospital.services.DataDoctores;
import hospital.view.DoctorView;
import hospital.view.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {


        LoginView view = new LoginView();


        BackEnde back = new BackEnde();

        LoginController controller = new LoginController(view);


    }
}