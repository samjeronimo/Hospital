import javax.swing.*;

import hospital.controller.LoginController;
import hospital.view.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {

        LoginView view = new LoginView();

        LoginController controller = new LoginController(view);

    }
}