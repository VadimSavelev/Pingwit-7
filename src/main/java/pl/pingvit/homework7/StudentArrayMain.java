package pl.pingvit.homework7;
import org.w3c.dom.Text;
public class StudentArrayMain {
    public static void main(String[] args) {
        Student student1 = new Student("Vadim", 32);
        Student student2 = new Student("Swetlana", 26);
        Student student3 = new Student("Anna", 28);
        Student student4 = new Student("Illya", 25);
        Student student5 = new Student("Tonya", 29);

        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
