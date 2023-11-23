//Re write the student mark sheet program using if else and while loop.
package questions;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for three subjects:");
        int totalMarks = 0;
        int count = 1;
        while (count <= 3) {
            System.out.print("Subject " + count + " marks: ");
            int marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;
                count++;
            } else {
                System.out.println("Marks should be between 0 and 100. Please enter again.");
            }
        }

        double average = totalMarks / 3.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);

        System.out.print("Grade: ");
        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
