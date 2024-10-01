package hospital.services;

import hospital.model.Salas;

import java.util.ArrayList;
import java.util.List;

public class DataSalas {

    private List<Salas> salas;

    public DataSalas(){
        salas = new ArrayList<>();
        listaSalas();
    }

    private void listaSalas(){
        ArrayList<Salas> sala = new ArrayList<>();
        sala.add(new Salas("Sala de Urgencias", "Disponible"));
        sala.add(new Salas("Sala de Cuidados Intensivos (UCI)", "En uso"));
        sala.add(new Salas("Sala de Neonatología", "Fuera de servicio"));
        sala.add(new Salas("Sala de Maternidad", "En uso"));
        sala.add(new Salas("Sala de Cirugía", "Disponible"));
        sala.add(new Salas("Sala de Recuperación", "Fuera de servicio"));
        sala.add(new Salas("Sala de Rayos X", "En uso"));
        sala.add(new Salas("Sala de Quimioterapia", "Disponible"));
        sala.add(new Salas("Sala de Pediatría", "En uso"));
        sala.add(new Salas("Sala de Cardiología", "Fuera de servicio"));
        sala.add(new Salas("Sala de Espera", "Disponible"));
        sala.add(new Salas("Sala de Observación", "En uso"));
    }

    public List<Salas> getSalas(){
        return salas;
    }

    public void mostrarSalas(){
        for (Salas sala : salas){
            sala.toString();
        }
    }

}

