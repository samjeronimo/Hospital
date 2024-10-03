package hospital.services;

import hospital.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataFarmacia {
    public static ArrayList listaMedicamentos(){
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("Paracetamol", "Comprimidos", "500 mg cada 4-6 horas", "Paracetamol", LocalDate.of(2025, 5, 27),"B0015T3", 2.50, "ratamiento de dolor leve a moderado, fiebre", "Hipersensibilidad al paracetamol, enfermedad hepática severa"));
        medicamentos.add(new Medicamento("Ibuprofeno","Tabletas", "200-400 mg cada 4-6 horas", "Ibuprofeno", LocalDate.of(2024, 1, 12), "A14234J", 4.00, "Alivio de dolor inflamatorio, fiebre, artritis", "Úlcera péptica activa, insuficiencia renal grave, asma inducida por AINEs"));
        medicamentos.add(new Medicamento("Aspirina","Cápsulas", "500 mg cada 8 horas", "Aspirina", LocalDate.of(2022, 6, 14), "C00928X", 8.00, " Infecciones bacterianas como otitis, bronquitis, infecciones de piel", " Alergia a penicilinas, mononucleosis infecciosa"));
        medicamentos.add(new Medicamento("Amoxicilina","Cápsulas", "500 mg cada 8 horas", "Amoxicilina", LocalDate.of(2025, 8, 25), "C00928X", 8.00, " Infecciones bacterianas como otitis, bronquitis, infecciones de piel", "Alergia a penicilinas, mononucleosis infecciosa"));
        medicamentos.add(new Medicamento("Omeprazol","Cápsulas", "20 mg al día", "Omeprazol", LocalDate.of(2022, 7, 31), "D00712P", 3.00, "Tratamiento de úlceras gástricas, reflujo gastroesofágico", "Hipersensibilidad al omeprazol, insuficiencia hepática grave"));
        medicamentos.add(new Medicamento("Metformina", "Comprimidos", "500-850 mg dos o tres veces al día", "M0345X",LocalDate.of(2026, 5, 30), "M0345X", 5.50, "Tratamiento de la diabetes tipo 2", "Insuficiencia renal grave, acidosis láctica, hipersensibilidad a metformina"));
        medicamentos.add(new Medicamento("Losartán", "Tabletas", "50 mg una vez al día", "Losartán potásico", LocalDate.of(2025, 12, 04), "E00917M", 6.00, "Hipertensión arterial, insuficiencia cardíaca", " Hipersensibilidad al losartán, embarazo"));
        medicamentos.add(new Medicamento("Atorvastatina", "Comprimidos", "10-80 mg al día", "Atorvastatina cálcica", LocalDate.of(2026, 11, 02), "A01023L", 15.00, "Hipercolesterolemia, prevención de enfermedades cardiovasculares", "Enfermedad hepática activa, embarazo, lactancia"));
        medicamentos.add(new Medicamento("Simvastatina", "Tabletas", "10-40 mg al día", "Simvastatina", LocalDate.of(2024, 5, 25), "S01145F", 12.00, "Reducción de colesterol LDL y triglicéridos", "Enfermedad hepática activa, embarazo, lactancia"));
        medicamentos.add(new Medicamento("Enalapril", "Tabletas", "5-20 mg al día", "Enalapril maleato", LocalDate.of(2024, 5, 25), "E01567R", 7.00, " Hipertensión arterial, insuficiencia cardíaca", "Hipersensibilidad a los inhibidores de la ECA, angioedema"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tabletas", "50-200 mcg al día", "Levotiroxina sódica", LocalDate.of(2024, 5, 25), "L00654Y", 4.00, "Hipotiroidismo", "Hipersensibilidad a levotiroxina, tirotoxicosis no tratada"));
        medicamentos.add(new Medicamento("Clonazepam", "Tabletas", "0.5-2 mg al día", "Clonazepam", LocalDate.of(2024, 5, 25), "C00234P", 10.00, "Trastornos de ansiedad, convulsiones", "Insuficiencia hepática grave, glaucoma de ángulo cerrado"));
        medicamentos.add(new Medicamento("Furosemida", "Tabletas", "20-40 mg al día", "Furosemida", LocalDate.of(2024, 5, 25), "F01924L", 3.00, "Insuficiencia cardíaca, edema", "Anuria, deshidratación, hipovolemia"));
        medicamentos.add(new Medicamento("Lisinopril", "Tabletas", "10-40 mg al día", "Lisinopril", LocalDate.of(2024, 5, 25), "L01234K", 6.50, "Hipertensión, insuficiencia cardíaca", "Angioedema, hipersensibilidad a inhibidores de la ECA"));
        medicamentos.add(new Medicamento("Cetirizina", "Tabletas", "10 mg al día", "Cetirizina", LocalDate.of(2024, 5, 25), "C00843Z", 5.00, "Rinitis alérgica, urticaria", "Hipersensibilidad a cetirizina, insuficiencia renal grave"));
        medicamentos.add(new Medicamento("Dexametasona", "Tabletas", "0.5-10 mg al día", "Dexametasona", LocalDate.of(2024, 5, 25), "D01543R", 7.00, "Alergias, inflamación", "Infecciones fúngicas sistémicas, hipersensibilidad"));
        medicamentos.add(new Medicamento("Ciprofloxacino", "Tabletas", "500-750 mg cada 12 horas", "Ciprofloxacino", LocalDate.of(2024, 5, 25), "C02567D", 12.00, "Infecciones bacterianas", "Hipersensibilidad a quinolonas, embarazo, lactancia"));
        medicamentos.add(new Medicamento("Diazepam", "Tabletas", "5-10 mg al día", "Diazepam", LocalDate.of(2024, 5, 25), "D00234L", 9.00, "Ansiedad, espasmos musculares", "Insuficiencia respiratoria, miastenia gravis"));
        medicamentos.add(new Medicamento("Levofloxacino", "Tabletas", "500 mg cada 24 horas", "Levofloxacino", LocalDate.of(2024, 5, 25), "L00734C", 15.00, "Infecciones bacterianas", "Hipersensibilidad a quinolonas, epilepsia"));
        medicamentos.add(new Medicamento("Prednisona", "Tabletas", "5-60 mg al día", "Prednisona", LocalDate.of(2024, 5, 25), "P00943X", 8.50, "Enfermedades inflamatorias, alergias", "Infecciones fúngicas sistémicas, hipersensibilidad"));
        medicamentos.add(new Medicamento("Pantoprazol", "Tabletas", "40 mg al día", "Pantoprazol", LocalDate.of(2024, 5, 25), "P01234V", 9.00, "Reflujo gastroesofágico, úlceras gástricas", "Hipersensibilidad al pantoprazol"));
        medicamentos.add(new Medicamento("Esomeprazol", "Tabletas", "20-40 mg al día", "Esomeprazol", LocalDate.of(2024, 5, 25), "E01012W", 10.00, "Úlceras gástricas, reflujo gastroesofágico", "Hipersensibilidad a esomeprazol"));
        medicamentos.add(new Medicamento("Azitromicina", "Tabletas", "500 mg al día", "Azitromicina", LocalDate.of(2024, 5, 25), "A01234Q", 18.00, "Infecciones bacterianas", "Hipersensibilidad a macrólidos, insuficiencia hepática grave"));
        medicamentos.add(new Medicamento("Alprazolam", "Tabletas", "0.25-0.5 mg tres veces al día", "Alprazolam", LocalDate.of(2024, 5, 25), "A00123P", 7.00, "Trastornos de ansiedad, ataques de pánico", "Insuficiencia respiratoria, glaucoma de ángulo cerrado"));
        medicamentos.add(new Medicamento("Fluoxetina", "Cápsulas", "20-80 mg al día", "Fluoxetina", LocalDate.of(2024, 5, 25), "F00567B", 12.50, "Depresión, trastornos de ansiedad", "Hipersensibilidad, uso concomitante con inhibidores de la MAO"));
        medicamentos.add(new Medicamento("Venlafaxina", "Cápsulas", "75-225 mg al día", "Venlafaxina", LocalDate.of(2024, 5, 25), "V01234H", 15.00, "Depresión, ansiedad", "Hipersensibilidad, uso concomitante con inhibidores de la MAO"));
        medicamentos.add(new Medicamento("Lorazepam", "Tabletas", "1-4 mg al día", "Lorazepam", LocalDate.of(2024, 5, 25), "L01984Z", 10.00, "Ansiedad, insomnio", "Insuficiencia respiratoria, glaucoma de ángulo cerrado"));
        medicamentos.add(new Medicamento("Tramadol", "Tabletas", "50-100 mg cada 6 horas", "Tramadol", LocalDate.of(2024, 5, 25), "T00123K", 8.00, "Dolor moderado a severo", "Hipersensibilidad, intoxicación aguda con depresores del SNC"));
        medicamentos.add(new Medicamento("Sertralina", "Tabletas", "50-200 mg al día", "Sertralina", LocalDate.of(2024, 5, 25), "S00987T", 12.00, "Depresión, trastornos de ansiedad", "Hipersensibilidad, uso concomitante con inhibidores de la MAO"));
        medicamentos.add(new Medicamento("Escitalopram", "Tabletas", "10-20 mg al día", "Escitalopram", LocalDate.of(2024, 5, 25), "E01234L", 11.00, "Depresión, trastornos de ansiedad", "Hipersensibilidad, uso concomitante con inhibidores de la MAO"));
        medicamentos.add(new Medicamento("Duloxetina", "Cápsulas", "30-60 mg al día", "Duloxetina", LocalDate.of(2024, 5, 25), "D02345B", 13.00, "Depresión, dolor neuropático", "Hipersensibilidad, insuficiencia hepática severa"));
        medicamentos.add(new Medicamento("Bupropion", "Tabletas", "150-300 mg al día", "Bupropion", LocalDate.of(2024, 5, 25), "B01234V", 14.00, "Depresión, dejar de fumar", "Hipersensibilidad, trastornos convulsivos"));
        medicamentos.add(new Medicamento("Risperidona", "Tabletas", "1-6 mg al día", "Risperidona", LocalDate.of(2024, 5, 25), "R01934P", 20.00, "Esquizofrenia, trastorno bipolar", "Hipersensibilidad, demencia con cuerpos de Lewy"));
        medicamentos.add(new Medicamento("Olanzapina", "Tabletas", "5-20 mg al día", "Olanzapina", LocalDate.of(2024, 5, 25), "O01984M", 18.00, "Esquizofrenia, trastorno bipolar", "Hipersensibilidad, insuficiencia hepática grave"));
        medicamentos.add(new Medicamento("Quetiapina", "Tabletas", "150-800 mg al día", "Quetiapina", LocalDate.of(2024, 5, 25), "Q00345T", 22.00, "Esquizofrenia, trastorno bipolar", "Hipersensibilidad, intoxicación aguda con alcohol o drogas"));
        medicamentos.add(new Medicamento("Lamotrigina", "Tabletas", "100-200 mg al día", "Lamotrigina", LocalDate.of(2024, 5, 25), "L02345F", 25.00, "Epilepsia, trastorno bipolar", "Hipersensibilidad, insuficiencia hepática grave"));
        medicamentos.add(new Medicamento("Valproato", "Tabletas", "500-1000 mg al día", "Ácido valproico", LocalDate.of(2024, 5, 25), "V00987Z", 24.00, "Epilepsia, trastorno bipolar", "Hipersensibilidad, insuficiencia hepática grave"));
        medicamentos.add(new Medicamento("Gabapentina", "Cápsulas", "300-900 mg al día", "Gabapentina", LocalDate.of(2024, 5, 25), "G01234M", 30.00, "Dolor neuropático, epilepsia", "Hipersensibilidad, insuficiencia renal grave"));
        medicamentos.add(new Medicamento("Pregabalina", "Cápsulas", "150-600 mg al día", "Pregabalina", LocalDate.of(2024, 5, 25), "P01432Q", 35.00, "Dolor neuropático, trastorno de ansiedad", "Hipersensibilidad, insuficiencia renal grave"));


        return medicamentos;
    }
}
