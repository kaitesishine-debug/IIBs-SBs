public class UNEBRegistration {

    // General examination settings
    static int examYear;
    static double registrationFee;
    static String gradingPolicy;

    // Static initialization block
    static {
        System.out.println("[STATIC BLOCK] Loading examination configuration...");

        examYear = 2026;
        registrationFee = 50000;
        gradingPolicy = "UNEB Standard Grading";

        System.out.println("[STATIC BLOCK] Exam Year: " + examYear);
        System.out.println("[STATIC BLOCK] Registration Fee: UGX " + registrationFee);
        System.out.println("[STATIC BLOCK] Grading Policy: " + gradingPolicy);
    }

    public static void main(String[] args) {

        System.out.println("=== UNEB CANDIDATE REGISTRATION SYSTEM ===");

        System.out.println("\n[MAIN] Creating first candidate...");
        Candidate candidate1 = new Candidate(
                "Sarah Namukasa",
                "Makerere High School"
        );

        System.out.println("\n[MAIN] Creating second candidate...");
        Candidate candidate2 = new Candidate(
                "John Okello",
                "Kampala Secondary School"
        );

        System.out.println("\n=== CANDIDATE DETAILS ===");

        candidate1.displayCandidateInfo();

        System.out.println();

        candidate2.displayCandidateInfo();
    }
}
