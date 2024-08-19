package PersonalMedico;


import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;

import javax.swing.*;
import java.awt.*;

public class DoctorGeneral extends JFrame {

    public DoctorGeneral(){
        this.setLocationRelativeTo(null);
        this.setBounds(0,0,1300,850);


        JPanel mainPanel = new JPanel(new GridLayout(1,3));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.gray);
        panel1.setLayout(null);

        JLabel titulo = new JLabel("Doctor/a Juanito");
        titulo.setBounds(170,100,100,100);
        panel1.add(titulo);

        JPanel raya1 = new JPanel();
        raya1.setBackground(Color.black);
        raya1.setBounds(20,340,400,2);
        panel1.add(raya1);

        JPanel raya2 = new JPanel();
        raya2.setBackground(Color.black);
        raya2.setBounds(20,430,400,2);
        panel1.add(raya2);

        JPanel raya3 = new JPanel();
        raya3.setBackground(Color.black);
        raya3.setBounds(20,520,400,2);
        panel1.add(raya3);

        JPanel raya4 = new JPanel();
        raya4.setBackground(Color.black);
        raya4.setBounds(20,610,400,2);
        panel1.add(raya4);

        JPanel raya5 = new JPanel();
        raya5.setBackground(Color.black);
        raya5.setBounds(20,700,400,2);
        panel1.add(raya5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.gray);
        panel2.setLayout(null);

        JLabel subTitulo = new JLabel("Pacientes");
        subTitulo.setBounds(160,165,100,100);
        panel2.add(subTitulo);

        JPanel miniPanel2 = new JPanel();
        miniPanel2.setBounds(38,260,300,500);
        miniPanel2.setBackground(Color.black);
        miniPanel2.setLayout(null);
        panel2.add(miniPanel2);

        JPanel chikiPanel2 = new JPanel();
        chikiPanel2.setBackground(Color.white);
        chikiPanel2.setBounds(17,20,268,465);
        chikiPanel2.setLayout(null);
        miniPanel2.add(chikiPanel2);

        JButton horaExtra1 = new JButton("Pedro Oliva");
        horaExtra1.setBounds(18,105,230,80);
        chikiPanel2.add(horaExtra1);

        JButton horaExtra2 = new JButton("Samantha Juarez");
        horaExtra2.setBounds(18,15,230,80);
        chikiPanel2.add(horaExtra2);

        JButton horaExtra3 = new JButton();
        horaExtra3.setBackground(Color.gray);
        horaExtra3.setBounds(18,195,230,80);
        chikiPanel2.add(horaExtra3);

        JButton horaExtra4 = new JButton("Ana López");
        horaExtra4.setBounds(18,285,230,80);
        chikiPanel2.add(horaExtra4);

        JButton horaExtra5 = new JButton("Juan Hernández");
        horaExtra5.setBounds(18,375,230,80);
        chikiPanel2.add(horaExtra5);


        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.gray);
        panel3.setLayout(null);

        JLabel subTitulo2 = new JLabel("Horario//Citas");
        subTitulo2.setBounds(200,165,100,100);
        panel3.add(subTitulo2);

        JPanel miniPanel3 = new JPanel();
        miniPanel3.setBounds(90,260,300,500);
        miniPanel3.setBackground(Color.black);
        miniPanel3.setLayout(null);
        panel3.add(miniPanel3);

        JPanel chikiPanel3 = new JPanel();
        chikiPanel3.setBackground(Color.white);
        chikiPanel3.setBounds(17,20,268,465);
        chikiPanel3.setLayout(new GridLayout(5,1));
        chikiPanel3.setLayout(null);
        miniPanel3.add(chikiPanel3);

        JPanel hora1 = new JPanel();
        hora1.setBackground(Color.BLUE);
        hora1.setBounds(18,105,230,80);
        chikiPanel3.add(hora1);

        JLabel miniHora1 = new JLabel("7:00a.m");
        hora1.add(miniHora1);

        JLabel miniHora11 = new JLabel("10:00a.m");
        hora1.add(miniHora11);

        JPanel hora2 = new JPanel();
        hora2.setBackground(Color.red);
        hora2.setBounds(18,15,230,80);
        chikiPanel3.add(hora2);

        JPanel hora3 = new JPanel();
        hora3.setBackground(Color.gray);
        hora3.setBounds(18,195,230,80);
        chikiPanel3.add(hora3);

        JPanel hora4 = new JPanel();
        hora4.setBackground(Color.green);
        hora4.setBounds(18,285,230,80);
        chikiPanel3.add(hora4);

        JPanel hora5 = new JPanel();
        hora5.setBackground(Color.pink);
        hora5.setBounds(18,375,230,80);
        chikiPanel3.add(hora5);



        mainPanel.add(panel3);
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        this.add(mainPanel);
        this.setVisible(true);
    }
}
