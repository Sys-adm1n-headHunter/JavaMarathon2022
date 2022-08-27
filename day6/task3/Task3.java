package day6.task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Сидоров Игорь Николаевич","Математика");
        Student student = new Student("Плотников Леонид Петрович");

        teacher.evaluate(student);
    }
}
