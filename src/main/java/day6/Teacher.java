package day6;

import java.util.Random;

public class Teacher {

    private String fio;
    private String predmet;

    public Teacher(String fio, String predmet) {
        this.fio = fio;
        this.predmet = predmet;

    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "неудовлетворительно";
                break;

            case 3:
                evaluation = "удовлетворительно";
                break;

            case 4:
                evaluation = "хорошо";
                break;

            case 5:
                evaluation = "отлично";
                break;
        }

        System.out.println("Преподаватель: " + this.fio + " оценил студента с именем: " +
                student.getFio() + " по предмету: " + this.predmet + " на оценку: " + evaluation);
    }
}
