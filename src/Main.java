import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(1, "Sreya", "Math", 24);
        students.add(s1);
        Student s2 = new Student(2, "Raga", "Science", 25);
        students.add(s2);
        System.out.println("Number of students: " + students.size());

        int userInput = 0;
        while (userInput != 6) {
            System.out.println("===========================");
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("===========================");
            System.out.println("1.Add Student");
            System.out.println("2.View all Students");
            System.out.println("3.Search Student");
            System.out.println("4.Update Student");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");

            System.out.println("Enter your Choice: ");
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    //System.out.println("Add Student");
                    System.out.println("Enter Students ID: ");
                    int studentID = sc.nextInt();
                    System.out.println("Enter Students Name: ");
                    String studentName = sc.next();
                    System.out.println("Enter Students Course: ");
                    String studentCourse = sc.next();
                    System.out.println("Enter Students Age: ");
                    int studentAge = sc.nextInt();
                    Student s = new Student(studentID, studentName, studentCourse, studentAge);
                    students.add(s);
                    System.out.println("Student added Successfully!");
                    break;
                case 2:
                    //System.out.println("View All Students");
                    if (students.size() == 0) {
                        System.out.println("No Students Found!");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println("ID: " + students.get(i).getStudentID() + " " + "Name: " + students.get(i).getName() + " " + "Course: " + students.get(i).getCourse() + " " + "Age: " + students.get(i).getAge());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Search Students");
                    System.out.println("Enter Student ID to Search: ");
                    studentID = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (studentID == students.get(i).getStudentID()) {
                            System.out.println("Student Found!");
                            System.out.println("ID: " + students.get(i).getStudentID() + " " + "Name: " + students.get(i).getName() + " " + "Course: " + students.get(i).getCourse() + " " + "Age: " + students.get(i).getAge());
                            found = true;
                            break;

                        }
                    }
                    if(!found)
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Update Student");
                    break;
                case 5:
                    System.out.println("Delete Student");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Onvalid Input! Try Entering between 1 and 6");


            }

        }
    }
}





