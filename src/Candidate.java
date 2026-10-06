public class Candidate {
    private String name;
    private String school;

    private String registrationStatus;
    private String examinationCentre;

    public void displayCandidateInfo() {
        System.out.println("Candidate Name: " + name);
        System.out.println("School: " + school);
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("Examination Centre: " + examinationCentre);
    }
}
