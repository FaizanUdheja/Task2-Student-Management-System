package Task_2;

public class Student {
    //Variable Declaration
    private int id;
    private String name;
    private String grade;
    //Default Constructor
    public Student(){}
    //Parameterized Constructor
    public Student(int id, String name, String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //getter for id()
    public int getId(){return id;}
    //toString () for output
    @Override
    public String toString() {
        return "Student:- " + "id=" + id + ", name='" + name + '\'' + ", grade='" + grade + '\'' + '}';
    }
}
