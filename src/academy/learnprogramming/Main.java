package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    public static Hospital hospital = new Hospital();

    public static void main(String[] args) {
        hospital.addPatientData("Bob", "headache");
        hospital.addPatientData("Rick", "tooth decay");
        hospital.addPatientData("Emma", "pregnancy");
        hospital.printPatientList();
        int search = hospital.findPatient("Bob");
        System.out.println(search);
        hospital.removePatient("Emma");
        hospital.printPatientList();
        Patient oldData = new Patient("Bob", "diabetes");
        hospital.addPatientData(oldData);
        Patient newData = new Patient("Rose", "acne");
        hospital.printPatientList();
        hospital.updatePatientData(oldData,newData);
        hospital.printPatientList();
    }
}
