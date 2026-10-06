public class Candidate {
    private String name;
    private String school;

    private String registrationStatus;
    private String examinationCentre;

    /*
     * Instance Initialization Block:
     * Executes every time a Candidate object is created.
     * It assigns default registration values to each candidate.
     */
    {
        System.out.println(
                "[INSTANCE INITIALIZATION BLOCK] Setting default registration values..."
        );

        registrationStatus = "REGISTERED";
        examinationCentre = "CENTRAL EXAMINATION CENTRE";
    }

    /*
     * Constructor:
     * Initializes candidate-specific information.
     * The constructor executes after the instance initialization block.
     */
    public Candidate(String name, String school) {

        System.out.println("[CONSTRUCTOR] Creating candidate: " + name);

        this.name = name;
        this.school = school;
    }

    public void displayCandidateInfo() {

        System.out.println("Candidate Name: " + name);
        System.out.println("School: " + school);
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("Examination Centre: " + examinationCentre);
    }
}
