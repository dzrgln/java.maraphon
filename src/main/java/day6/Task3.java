package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.setName("Анатолий Иософович");
        t.setSubject("cопротивление материалов");
        s.setName("Валерий Сопилов");
        t.evaluate(s);

        }

    }


class Teacher {
    Random rand = new Random();
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student s) {

        int mark = rand.nextInt(3);
        String textMark;
        switch (mark) {
            case 0:
                textMark = "отлично";
                break;
            case 1:
                textMark = "хорошо";
                break;
            case 2:
                textMark = "удволетворительно";
                break;
            default:
                textMark = "неудволетворительно";
                break;
        }
        System.out.println(" " + this.name + " оценил студента с именем " + s.getName() + " по предмету " + this.subject + " на оценку " + textMark);

    }

}

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}