import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] students = new int[numStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            students[i] = in.nextInt();
        }
        // for printing all grades
        System.out.print("Grades entered are: ");
        for (int num : students) {
            System.out.print(num + " ");
        }
        // Total
        int total = 0;
        for (int num : students) { // one loop but all of the elements are stored right away.
            total += num;
        }
        // Average
        int average = total / 5;
        System.out.println("Average grade of students: " + average);
        // Highest
        int highest = students[0]; // remember when sorting out an array make sure to create a variable and assign
                                   // the array [0].
        for (int num : students) {
            if (num > highest) {
                highest = num;
            }
        }
        System.out.println("Highest grade of students: " + highest);
        // Lowest
        int lowest = students[0];
        for (int num : students) {
            if (num < lowest) {
                lowest = num;
            }
        }
        System.out.println("Lowest grade of students: " + lowest);

        // last lesson is the use of tostring method.
        // Whatever changes you make in a function it cannnot be used outside of it
        // unless you did scope.
    }
}
