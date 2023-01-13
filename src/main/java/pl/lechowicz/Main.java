package pl.lechowicz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Patient johny = new Patient("Johny", "Bravo", 23, true);
        Patient anna = new Patient("Anna", "Kowalska", 21, false);
        Patient pablo = new Patient("Pablo", "Escabo", 32, true);
        Patient grazyna = new Patient("Grazyna", "Grazka", 38, false);
        Patient janusz = new Patient("Janusz", "Wąsacz", 50, true);
        List<Patient> patients = new LinkedList<>();
        patients.add(johny);
        patients.add(anna);
        patients.add(pablo);
        patients.add(grazyna);
        patients.add(janusz);
        for (Patient patient :patients
        ) {
            System.out.println(patient.toString());
        }
        Collections.sort(patients);
        System.out.println("Dane po przesortowaniu: ");
        for (Patient patient :patients
        ) {
            System.out.println(patient.toString());
        }
    }
}