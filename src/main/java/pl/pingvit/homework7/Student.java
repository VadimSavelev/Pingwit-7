package pl.pingvit.homework7;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder().append(age, student.age).append(name, student.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(age).toHashCode();
    }
}

