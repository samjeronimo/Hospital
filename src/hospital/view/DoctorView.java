package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};

    public DoctorView(HashMap<String, String>dataDoctores1) {

        setSize(pantalla[0], pantalla[1]);

        setTitle("Perfil del doctor");

        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());


        JLabel hospital = new JLabel("Hospital Santa Catalina");
        hospital.setForeground(Color.WHITE);
        hospital.setFont(new Font("Arial", Font.BOLD, 18));
        hospital.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        headerPanel.add(hospital, BorderLayout.WEST);


        JPanel userPanel = new JPanel();
        userPanel.setLayout(new BorderLayout());
        userPanel.setBackground(Color.DARK_GRAY);


        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(40, 40));
        logoPanel.setBackground(Color.YELLOW);

        logoPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));


        JPanel diseno = new JPanel();
        diseno.setLayout(new BoxLayout(diseno, BoxLayout.Y_AXIS));
        diseno.setBackground(Color.DARK_GRAY);



        String Nombre = dataDoctores1.get("Nombre");
        String Especilidad = dataDoctores1.get("Especialidad");

        JLabel nombreDoctor = new JLabel(Nombre);
        nombreDoctor.setForeground(Color.WHITE);
        nombreDoctor.setFont(new Font("Arial", Font.BOLD, 14));
        nombreDoctor.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JLabel especialidad = new JLabel(Especilidad);
        especialidad.setForeground(Color.LIGHT_GRAY);
        especialidad.setFont(new Font("Arial", Font.PLAIN, 12));
        especialidad.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        diseno.add(nombreDoctor);
        diseno.add(especialidad);

        userPanel.add(logoPanel, BorderLayout.WEST);
        userPanel.add(diseno, BorderLayout.CENTER);

        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
