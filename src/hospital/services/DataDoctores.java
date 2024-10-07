package hospital.services;

import hospital.model.DoctorGeneral;
import hospital.view.DoctorView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DataDoctores {

    public static ArrayList listaDoctores(){

        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral());


        return doctores;
    }

}