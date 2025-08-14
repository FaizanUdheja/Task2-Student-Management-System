package Task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Object declaration
    private final Scanner s = new Scanner(System.in);
    private final ArrayList<Student> arrayList = new ArrayList<>();
    //Add Student
    private void addStudent() {
        System.out.println("Enter Student Id:");
        int id =s.nextInt();
        s.nextLine();
        System.out.println("Enter Student Name:");
        String name = s.nextLine();
        System.out.println("Enter your grade:");
        String grade = s.nextLine();
        arrayList.add(new Student(id, name, grade));
        System.out.println("Student added");
    }
    //Remove Student
    private void removeStudent() {
        System.out.print("Enter Student Id to remove");
        int removeId= s.nextInt();
        for (Student s: arrayList ){
            if (s.getId() == removeId){
                arrayList.remove(s);
                System.out.println("Student removed");
            }
        }
    }
    //Display Student
    private void displayStudent() {
        for (Student s: arrayList){
            System.out.println(s);
        }
    }
    //Menu
    public void menu(){

        while(true) {
            System.out.println("1: Add Student");
            System.out.println("2: Remove Student");
            System.out.println("3: Display Student");
            System.out.println("4: Exit");
            System.out.println("Enter your choice:- ");

            int choice = s.nextInt();
            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                removeStudent();
            } else if (choice == 3){
                displayStudent();
            } else {
                System.out.println("Exiting");
                break;
            }
        }
    }
    //Main method
    public static void main(String [] args){
        Main m = new Main();
        m.menu();
    }
}
