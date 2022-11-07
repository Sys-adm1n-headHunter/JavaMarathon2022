package day06.task3;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }



    public void evaluate(Student student){
        Random random = new Random();
        int grade = random.nextInt(4) + 2;
        String evaluate = "";

        switch (grade){
            case 2:
                evaluate = "Неудовлетворительно";
                break;
            case 3:
                evaluate = "Удовлетворительно";
                break;
            case 4:
                evaluate = "Хорошо";
                break;
            case 5:
                evaluate = "Отлично";
                break;
        }
        System.out.println("Преподаватель "+ this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку "+ evaluate);
    }
}
