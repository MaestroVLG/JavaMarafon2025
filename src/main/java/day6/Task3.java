package day6;

public class Task3 {
    public static void main(String[] args) {

    Teacher teacher = new Teacher("Тестовый Иван Алексеевич", "Физика");
    Student student = new Student("Молодой Пётр Петрович");

    teacher.evaluate(student);

    }
}
