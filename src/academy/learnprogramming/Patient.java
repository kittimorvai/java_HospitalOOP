package academy.learnprogramming;

public class Patient extends Hospital {
    private String name;
    private String symptom;

    public Patient(String name, String symptom) {
        this.name = name;
        this.symptom = symptom;
    }

    public static Patient createPatient (String name, String symptom){
       return new Patient (name,symptom);
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }
}
