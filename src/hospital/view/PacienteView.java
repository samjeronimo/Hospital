package hospital.view;

import hospital.model.Pacientes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;



public class PacienteView {

    private ArrayList<Pacientes> listaPacientes;

    public PacienteView(ArrayList<Pacientes> pacientes) {
        this.listaPacientes = pacientes;
    }

    public JPanel panelPaciente(ArrayList<Pacientes> pacientes) {
        this.listaPacientes = pacientes;

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("Listado de pacientes");
        panel.add(titulo);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};

        JPanel panelTitulos = new JPanel();
        panelTitulos.setLayout(new GridLayout(1, campos.length)); // Una fila, una columna por título

        for (String campo : campos) {
            JLabel labelCampo = new JLabel(campo, SwingConstants.CENTER);
            labelCampo.setFont(new Font("Arial", Font.BOLD, 12));
            panelTitulos.add(labelCampo);
        }

        panel.add(panelTitulos);

        for (Pacientes paciente : listaPacientes) {
            JPanel fila = new JPanel();
            fila.setLayout(new GridLayout(1, campos.length));

            fila.add(new JLabel(paciente.getNombre(), SwingConstants.CENTER));
            fila.add(new JLabel(paciente.getFechaNacimiento(), SwingConstants.CENTER));
            fila.add(new JLabel(paciente.getHorarioCita(), SwingConstants.CENTER));
            fila.add(new JLabel(paciente.getMotivoVisita(), SwingConstants.CENTER));

            panel.add(fila);
        }

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        return panel;

    }


}
