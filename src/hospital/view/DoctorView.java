package hospital.view;

import hospital.model.Pacientes;
import hospital.services.DataPacientes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};
    private ArrayList<Pacientes> listaPacientes = DataPacientes.listaPacientes();
    private JPanel mainPanel;

    public DoctorView(HashMap<String, String>dataDoctores1) {
        this.listaPacientes = listaPacientes;

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
        add(componeteMenuLateral(),BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacienteView pacienteView = new PacienteView(listaPacientes);
        JPanel panelPaciente = pacienteView.panelPaciente(listaPacientes);
        this.add(panelPaciente, BorderLayout.CENTER);

        setVisible(true);
    }


    private JPanel componeteMenuLateral () {

        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.darkGray);

        JPanel menu = new JPanel();
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;


        menu.add(op("Consultas del Día"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc);
        menu.add(op("Pacientes registrados"), gbc);
        menu.add(op("Citar en otra area"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op (String texto) {
        JButton op = new JButton("salas");

        op.addActionListener(e -> {
            CardLayout cl = (CardLayout) mainPanel.getLayout();
            cl.show(mainPanel, "Salas");
        });

        return op;
    }

    private JPanel panelSalas() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(Color.white);

        JLabel titulo = new JLabel("Salas", SwingConstants.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 12));
        titulo.setBorder(new EmptyBorder(10, 20, 10, 10));
        titulo.setForeground(Color.gray);

        JPanel panelSalas = new JPanel();
        panelSalas.setLayout(new GridLayout(3, 4, 20, 20));
        panelSalas.setBackground(Color.white);

        panelSalas.add(Panel("Sala de Emergencias", "En uso"));
        panelSalas.add(Panel("Sala de Cirugía", "Fuera de servicio"));
        panelSalas.add(Panel("Sala de Pediatría", "Disponible"));
        panelSalas.add(Panel("Sala de Ginecología", "En uso"));
        panelSalas.add(Panel("Sala de Oncología", "Disponible"));
        panelSalas.add(Panel("Sala de Terapia Intensiva", "Fuera de servicio"));
        panelSalas.add(Panel("Sala de Maternidad", "En uso"));
        panelSalas.add(Panel("Sala de Radiología", "Disponible"));
        panelSalas.add(Panel("Sala de Hospitalización", "En uso"));
        panelSalas.add(Panel("Sala de Consulta Externa", "Fuera de servicio"));
        panelSalas.add(Panel("Sala de Neonatología", "Disponible"));
        panelSalas.add(Panel("Sala de Recuperación", "En uso"));

        panelSalas.setBorder(new EmptyBorder(20, 20, 20, 20));

        panel1.add(titulo, BorderLayout.NORTH);
        panel1.add(panelSalas, BorderLayout.CENTER);

        return panel1;
    }

    private JPanel Panel(String nombre, String estado) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(150, 150));


        switch (nombre) {
            case "Sala de Emergencias":
            case "Sala de Radiología":
                panel.setBackground(new Color(255, 102, 102));
                break;
            case "Sala de Cirugía":
            case "Sala de Pediatría":

                panel.setBackground(new Color(255, 255, 153));
                break;
            case "Sala de Consulta Externa":
            case "Sala de Terapia Intensiva":
            case "Sala de Maternidad":
                panel.setBackground(new Color(153, 255, 153));
                break;
            case "Sala de Ginecología":
            case "Sala de Oncología":
            case "Sala de Hospitalización":
            case "Sala de Neonatología":
            case "Sala de Recuperación":
            default:
                panel.setBackground(Color.white);
                panel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
                break;


        }

        JLabel title = new JLabel(nombre, SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(title, BorderLayout.CENTER);

        return panel;
    }

    /*public static void main(String[] args) {
        HashMap<String, String> datos = new HashMap<>();
        datos.put("nombre doctor", "Dr. Juan Pérez");
        datos.put("especialidad", "Cardiología");

        SwingUtilities.invokeLater(() -> {
            DoctorView doctorView = new DoctorView(datos);
            doctorView.setVisible(true);
        });
    }*/

}
