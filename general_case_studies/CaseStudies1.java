import java.util.Scanner;

public class CaseStudies1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        double[] marks = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            total += marks[i];
        }

        double percentage = (total / 500) * 100;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        String status = (percentage >= 50) ? "Passed" : "Failed";

        System.out.println("\n--- Student Result Sheet ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
