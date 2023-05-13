import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patient_no = sc.nextInt();
        int steps_by_p1 = sc.nextInt();
        System.out.println(findNumOfStepsRequired(patient_no, steps_by_p1));
    }

    public static int findNumOfStepsRequired(int patient_no, int steps_by_p1) {
        return patient_no * steps_by_p1;

    }
}