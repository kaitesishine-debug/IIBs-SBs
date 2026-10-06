public class UNEBRegistration {

    // Static variables store examination settings shared by the entire application.
    static int examYear;
    static double registrationFee;
    static String gradingPolicy;

    /*
     * Static Initialization Block:
     * Executes once when the UNEBRegistration class is loaded by the JVM.
     * It is used to initialize general examination configuration.
     */
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

        System.out.println("\n==============================================");
        System.out.println("     UGANDA NATIONAL EXAMINATIONS BOARD");
        System.out.println("          CANDIDATE REGISTRATION");
        System.out.println("==============================================");

        System.out.println("\n[MAIN] Examination settings are ready.");
        System.out.println("[MAIN] Creating first candidate...");

        Candidate candidate1 = new Candidate(
                "Sarah Namukasa",
                "Makerere High School"
        );

        System.out.println("\n[MAIN] Creating second candidate...");

        Candidate candidate2 = new Candidate(
                "John Okello",
                "Kampala Secondary School"
        );

        System.out.println("\n==============================================");
        System.out.println("             CANDIDATE DETAILS");
        System.out.println("==============================================");

        System.out.println("\n--- Candidate 1 ---");
        candidate1.displayCandidateInfo();

        System.out.println("\n--- Candidate 2 ---");
        candidate2.displayCandidateInfo();

        System.out.println("\n==============================================");
        System.out.println("       REGISTRATION PROCESS COMPLETED");
        System.out.println("==============================================");
    }
}
