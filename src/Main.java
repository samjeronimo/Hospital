import javax.swing.*;

import hospital.controller.LoginController;
import hospital.view.DoctorView;
import hospital.view.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {


    LoginView login = new LoginView();

    LoginController controller = new LoginController(login);

    new DoctorView();
    }
}