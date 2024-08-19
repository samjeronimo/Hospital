import PersonalMedico.DoctorGeneral;
import Data.bdDocotores;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login(){

        //CONFIGURACIÓN DE MI VENTANA
        this.setLocationRelativeTo(null);
        this.setBounds(0,0,1600,1000);



        //PANEL PRINCIPAL
        JPanel mainPanel = new JPanel(new GridLayout(1,2));

        //PANEL DEL BANNER
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.white);

        ImageIcon urling = new ImageIcon(getClass().getResource("img/imagen_de_hospital.jpg"));
        JLabel img = new JLabel();
        img.setIcon(urling);

        panel1.add(img);


        //SEGUNDO PANEL
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBackground(Color.white);

        //RESTRICCIONES
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JLabel user = new JLabel("Correo");
        panel2.add(user, restricciones);

        JTextField usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(350, 40));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        panel2.add(usuario, restricciones);

        JLabel contra = new JLabel("Password");
        restricciones.gridy = 2;
        restricciones.gridx = 0;
        panel2.add(contra, restricciones);

        JPasswordField password = new JPasswordField();
        password.setPreferredSize(new Dimension(350,40));
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        panel2.add(password, restricciones);


        //BOTÓN
        JButton boton = new JButton("Login");
        boton.setPreferredSize(new Dimension(100,25));
        restricciones.gridy = 4;
        restricciones.gridx = 0;
        panel2.add(boton, restricciones);


        //ACCIÓN DEL BOTÓN
        boton.addActionListener(e -> {

            if (bdDocotores.user[0].equalsIgnoreCase(usuario.getText())){
                if (bdDocotores.pass[0].equalsIgnoreCase(password.getText())){
                    DoctorGeneral userDoctor = new DoctorGeneral();
                }
            }else {
                JLabel msjError = new JLabel("Error de Correo");
                msjError.setForeground(Color.RED);
                mainPanel.add(msjError);
            }

            mainPanel.revalidate();
            mainPanel.repaint();

        });


        mainPanel.add(panel1);
        mainPanel.add(panel2);

        this.add(mainPanel);
        this.setVisible(true);

    }
}
