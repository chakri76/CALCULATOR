
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int m1, m2, m3;
    int total;
    double average;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;
    }

    void display() {
        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (m1 < 35 || m2 < 35 || m3 < 35) {
            System.out.println("Grade: Fail");
        }
        else if (average >= 90) {
            System.out.println("Grade: A+");
        }
        else if (average >= 80) {
            System.out.println("Grade: A");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}
class StudentGrade {
    public static void main(String[] args) {
        Student s = new Student();

        s.getDetails();
        s.calculate();
        s.display();
    }
}
