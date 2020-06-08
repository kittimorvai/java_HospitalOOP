package academy.learnprogramming;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patientList;

    public Hospital(){
        this.patientList = new ArrayList<Patient>();
    }


    public void addPatientData (String name, String symptom){
        if(patientList.contains(name)){
            System.out.println("The patient has already been added.");
        } else {
            Patient patientToAdd = Patient.createPatient(name,symptom);
            patientList.add(patientToAdd);
        }
    }

    public void addPatientData (Patient patient){
        if(patientList.contains(patient)){
            System.out.println("The patient has already been added.");
        } else {
            patientList.add(patient);
        }
    }

    public void printPatientList (){
        for (int i = 0; i < patientList.size(); i++){
            System.out.println((i+1) + ". patient and his/her symptoms: " + patientList.get(i).getName() + ", " +  patientList.get(i).getSymptom());
        }
    }

    public int findPatient (String name){
        for(int i = 0; i < this.patientList.size(); i++){
            if(this.patientList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void removePatient (String name){
        int position = findPatient(name);
        if(position < 0){
            System.out.println("No such patient");
        } else {
            patientList.remove(position);
            System.out.println("Patient called " + name + " successfully removed");
        }
    }

    public void updatePatientData (Patient oldData, Patient newData){
        int position = findPatient(oldData.getName());
        if (position < 0){
            System.out.println("No such patient");
        } else {
            patientList.set(position, newData);
            System.out.println(newData.getName() + " was successfully set.");
        }
    }
}
