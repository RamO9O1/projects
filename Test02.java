public class Test02 {
    public static int findNumOfStepsRequired(int escapedPatients, int startingStep) {
        int totalSteps = 0; // Total number of steps required

        // Iterate through each patient from 1 to the number of escaped patients
        for (int i = 1; i <= escapedPatients; i++) {
            // Calculate the number of steps required for each
            // patient

            // Update the total step count
            totalSteps += startingStep * i;
            ;
        }

        return totalSteps;
    }

    public static void main(String[] args) {
        int escapedPatients = 3; // Number of escaped patients
        int startingStep = 10; // Starting step of the first patient

        int totalSteps = findNumOfStepsRequired(escapedPatients, startingStep);
        System.out.println("Total steps required: " + totalSteps);
    }

}
