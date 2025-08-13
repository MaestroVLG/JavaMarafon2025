package day9.Task1;


public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Майкл", "КС-101");
        Teacher teacher = new Teacher("Ирина Иванова", "Высшая математика");

        String educationGroup = student.getEducationGroup();
        System.out.println("Название группы: " + educationGroup);

        String subject = teacher.getSubject();
        System.out.println("Предмет: " + subject);

        student.printInfo();
        teacher.printInfo();



    }
}
