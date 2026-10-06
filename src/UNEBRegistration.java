public class UNEBRegistration {

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

    }
}
