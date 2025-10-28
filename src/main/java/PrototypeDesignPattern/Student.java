package PrototypeDesignPattern;

public class Student implements Prototype
{
    private int id;
    private String name;
    private int age;

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Student() {

    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
