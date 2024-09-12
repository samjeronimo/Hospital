package Hospital.view;

import Hospital.model.DoctorGeneral;
import Hospital.servicies.bdDocotores;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LoginView extends JFrame {

    public LoginView(){

        this.setSize(500, 600);
        this.setLocationRelativeTo(null);


        JPanel mainPanel = new JPanel(new GridLayout(1, 1));


        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBackground(Color.white);


        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(15, 7, 15, 7);
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JLabel correo = new JLabel("Correo:");
        panel2.add(correo, restricciones);

        restricciones.gridx = 0;
        restricciones.gridy = 1;

        JTextField user = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        user.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        user.setPreferredSize(new Dimension(150, 30));
        panel2.add(user, restricciones);

        restricciones.gridx = 0;
        restricciones.gridy = 2;
        JLabel contra = new JLabel("Contraseña:");
        panel2.add(contra, restricciones);

        restricciones.gridx = 1;
        restricciones.gridy = 2;
        JPasswordField pass = new JPasswordField();
        pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        pass.setPreferredSize(new Dimension(150, 30));
        panel2.add(pass, restricciones);

        restricciones.gridx = 1;
        restricciones.gridy = 4;
        JButton btn = new JButton("Iniciar Sesión");
        btn.setBackground(new Color(116, 116, 116));
        btn.setForeground(new Color(255, 255, 255));
        panel2.add(btn, restricciones);



        mainPanel.add(panel2);

        this.add(mainPanel);
        this.setVisible(true);
    }
}
