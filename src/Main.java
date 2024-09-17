import javax.swing.*;

import backEnde.BackEnde;
import hospital.controller.LoginController;
import hospital.services.DataDoctores;
import hospital.view.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {


        LoginView view = new LoginView();

        DataDoctores dataDoc = new DataDoctores();

        BackEnde back = new BackEnde(dataDoc);

        LoginController controller = new LoginController(view, back);


    }
}