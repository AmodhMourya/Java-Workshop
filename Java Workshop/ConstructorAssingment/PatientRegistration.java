package ConstructorAssingment;
class PatientRegistration {
    private String patientName;
    private String disease;

    {
        System.out.println("Patient Registration Started");
    }

    public PatientRegistration() {
        this("Unknown Patient", "Not Specified");
    }

    public PatientRegistration(String patientName) {
        this(patientName, "Not Specified");
    }

    public PatientRegistration(String patientName, String disease) {
        this.patientName = patientName;
        this.disease = disease;
        System.out.println("Patient: " + this.patientName);
        System.out.println("Disease: " + this.disease);
    }

    public static void main(String[] args) {
        PatientRegistration patient = new PatientRegistration("Rohan", "Fever");
    }
}