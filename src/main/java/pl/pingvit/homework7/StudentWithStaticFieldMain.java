package pl.pingvit.homework7;

public class StudentWithStaticFieldMain {
    public static void main(String[] args) {
        Student student6 = new Student("Vadim", 32, Student.getText());
        student6.setText("Hello from student6 ");
        Student student7 = new Student("Swetlana", 26, Student.getText());
        Student student8 = new Student("Anna", 28, Student.getText());
        Student student9 = new Student("Illya", 25, Student.getText());
        Student student10 = new Student("Tonya", 29, Student.getText());

        Student[] students = {student6, student7, student8, student9, student10};
        for (Student student : students) {
            System.out.println(Student.getText());
        }
    }
}
