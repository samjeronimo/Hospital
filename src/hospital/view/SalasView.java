package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Arrays;

public class SalasView extends JFrame {

    public SalasView() {
        setTitle("Gestión de Salas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSalas = new JPanel(new GridLayout(3, 4, 10, 10)); // 3 filas, 4 columnas, 10px de margen
        cargarSalas(panelSalas);

        add(panelSalas);
    }

    private void cargarSalas(JPanel panel) {
        List<String> nombresSalas = Arrays.asList(
                "Sala de Urgencias", "Sala de Operaciones", "Sala de Maternidad",
                "Sala de Pediatría", "Sala de Cuidados Intensivos", "Sala de Quimioterapia",
                "Sala de Radiología", "Sala de Cardiología", "Sala de Recuperación",
                "Sala de Neonatología", "Sala de Traumatología", "Sala de Oncología"
        );

        List<String> estadosSalas = Arrays.asList(
                "En uso", "Fuera de servicio", "Disponible",
                "En uso", "Disponible", "Fuera de servicio",
                "En uso", "Disponible", "En uso",
                "Fuera de servicio", "Disponible", "En uso"
        );

        for (int i = 0; i < nombresSalas.size(); i++) {
            JPanel salaPanel = crearSalaPanel(nombresSalas.get(i), estadosSalas.get(i));
            panel.add(salaPanel);
        }
    }

    public JPanel crearSalaPanel(String nombre, String estado) {
        JPanel panel = new JPanel();
        JLabel nombreLabel = new JLabel(nombre);

        switch (estado) {
            case "En uso":
                panel.setBackground(Color.RED);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.GRAY);
                break;
            case "Disponible":
                panel.setBackground(Color.GREEN);
                break;
            default:
                panel.setBackground(Color.WHITE);
                break;
        }

        panel.add(nombreLabel);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Añade un borde para separar visualmente las salas
        panel.setPreferredSize(new Dimension(150, 50));  // Ajusta el tamaño del panel
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalasView salasView = new SalasView();
            salasView.setVisible(true);
        });
    }
}