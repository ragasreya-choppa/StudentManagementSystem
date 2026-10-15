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
                    System.out.println("Adding Student...");
                    System.out.println("Enter Student ID: ");
                    int studentID = sc.nextInt();
                    sc.nextLine();// consume the leftover new-line
                    boolean idExists = false;
                    for(int i=0;i<students.size();i++)
                    {
                        if((studentID == students.get(i).getStudentID()))
                        {
                            System.out.println("ID Already Exists! Try Entering Unique ID!");
                            idExists = true;
                            break;
                        }

                    }
                    if(!idExists)
                    {
                        System.out.println("Enter Student Name: ");
                        String studentName = sc.nextLine();
                        System.out.println("Enter Student Course: ");
                        String studentCourse = sc.nextLine();
                        System.out.println("Enter Student Age: ");
                        int studentAge = sc.nextInt();
                        if(studentAge<1 || studentAge>120)
                        {
                            System.out.println("Invalid Age! Try Entering Age between 1 and 120");
                        }
                        else
                        {
                            Student s = new Student(studentID, studentName, studentCourse, studentAge);
                            students.add(s);
                            System.out.println("Student added Successfully!");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Viewing All Students...");
                    if (students.size() == 0) {
                        System.out.println("No Student Found!");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println("ID: " + students.get(i).getStudentID() + " " + "Name: " + students.get(i).getName() + " " + "Course: " + students.get(i).getCourse() + " " + "Age: " + students.get(i).getAge());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Searching Students...");
                    System.out.println("Enter Student ID to Search: ");
                    studentID = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (studentID == students.get(i).getStudentID())
                        {
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
                    System.out.println("Updating Student...");
                    System.out.println("Enter Student ID to Update: ");
                    studentID = sc.nextInt();
                    boolean found1 = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (studentID == students.get(i).getStudentID()) {
                            System.out.println("Student Found!");
                            System.out.println("ID: " + students.get(i).getStudentID());
                            System.out.println("Name: " + students.get(i).getName());
                            System.out.println("Course: "+ students.get(i).getCourse());
                            System.out.println("Age: "+ students.get(i).getAge());
                            found1 = true;
                            System.out.println("Choose a Field to Update:  name/course/age- ");
                            String fieldToUpdate=sc.next();
                            switch(fieldToUpdate.toLowerCase())
                            {
                                case "name":
                                    System.out.println("Enter the new name: ");
                                    String nameUpdatedTo = sc.next();
                                    students.get(i).setName(nameUpdatedTo);
                                    System.out.println("Student Name Updated Successfully!");
                                    break;
                                case "course":
                                    System.out.println("Enter the new course: ");
                                    String courseUpdatedTo = sc.next();
                                    students.get(i).setCourse(courseUpdatedTo);
                                    System.out.println("Student Course Updated SuccessFully!");
                                    break;
                                case "age":
                                    System.out.println("Enter the new Age: ");
                                    int ageUpdatedTo=sc.nextInt();
                                    students.get(i).setAge(ageUpdatedTo);
                                    System.out.println("Student Age Updated SuccessFully!");
                                    break;
                                default:
                                    System.out.println("Invalid Input! Only Three Fields are allowed to Update");
                            }
                            break;
                        }
                    }
                    if(!found1)
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 5:
                    System.out.println("Deleting Student...");
                    System.out.println("Enter Student ID to Delete: ");
                    studentID = sc.nextInt();
                    boolean found2 = false;
                    for (int i = 0; i < students.size(); i++)
                    {
                        if (studentID == students.get(i).getStudentID())
                        {
                            System.out.println("Student Found!");
                            students.remove(i);
                            System.out.println("Student Deleted Successfully!");
                            found2=true;
                            break;
                        }
                    }
                    if(!found2)
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Input! Try Entering between 1 and 6");

            }

        }
    }
}





