import javax.swing.*;

public class Choices {
    public static void main(String[] args) {
        double totalMarks = 0;
        int numberOfSubjects = 7;

        for (int i = 1; i <= numberOfSubjects; i++) {
            double mark = -1;

            // Validate mark between 0 and 100
            while (mark < 0 || mark > 100) {
                String input = JOptionPane.showInputDialog("Enter marks for subject " + i + " (0–100):");
                if (input == null) return; // Cancelled
                try {
                    mark = Double.parseDouble(input);
                    if (mark < 0 || mark > 100) {
                        JOptionPane.showMessageDialog(null, "Please enter a mark between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                }
            }

            totalMarks += mark;
        }

        double average = totalMarks / numberOfSubjects;
        String grade;

        if (average < 40) {
            grade = "F";
        } else if (average < 50) {
            grade = "D";
        } else if (average < 60) {
            grade = "C";
        } else if (average < 70) {
            grade = "B";
        } else {
            grade = "A";
        }

        JOptionPane.showMessageDialog(null, 
            "Total Marks: " + totalMarks + "\n" +
            "Average: " + String.format("%.2f", average) + "\n" +
            "Grade: " + grade
        );
    }
}
