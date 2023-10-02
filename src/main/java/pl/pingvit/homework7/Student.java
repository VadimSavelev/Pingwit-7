package pl.pingvit.homework7;
public class Student {
    static private String text = "Hello from static";
    private String name;
    private int age;
    {
        System.out.println("A new instance of the class was created");
    }
    static {
        System.out.println(text);
    }
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String text) {
        this.name = name;
        this.age = age;
        Student.text = text;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static String getText() {
        return text;
    }
    public static void setText(String text) {
        Student.text = text;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

