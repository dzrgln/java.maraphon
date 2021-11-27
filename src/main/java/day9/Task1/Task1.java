package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Mike", "builders");
        Teacher teacher = new Teacher("Harry", "Resistance of materials");
        student.printInfo();
        teacher.printInfo();
    }
}

class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}

class Student extends Human {

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}

class Teacher extends Human {

    private String subjectName;

    public String getSubjectName(){
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }

}