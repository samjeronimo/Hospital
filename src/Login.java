import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login(){

        //MI VENTANA
        this.setLayout(null);
        this.setBounds(0,0,800,500);


        //CREDENCIALES
        JLabel user = new JLabel("Usuario");
        user.setBounds(420,65,100,50);
        this.add(user);

        JTextField usuario = new JTextField();
        usuario.setBounds(420,100,300,50);

        JLabel contra = new JLabel("Contraseña");
        contra.setBounds(420,135,100,50);
        this.add(contra);

        JTextField password = new JTextField();
        password.setBounds(420,170,300,50);

        JButton boton = new JButton("Login");
        boton.setBounds(520,230,200,60);


        this.add(usuario);
        this.add(password);
        this.add(boton);
        this.setVisible(true);

    }
}
