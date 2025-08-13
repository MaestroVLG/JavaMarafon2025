package day9.Task1;

public class Teacher extends Human {

    private String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;

    }

    @Override
    public void printInfo() {
        super.printInfo();                     // Родительский метод
        System.out.println("Этот преподаватель с именем: " + this.getName());
    }
}
