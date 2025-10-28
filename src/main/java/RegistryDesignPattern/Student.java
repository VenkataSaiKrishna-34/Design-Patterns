package RegistryDesignPattern;

public class Student {
    private int id;
    private String name;
    private int age;
    private String batch;

    Student(int id, String name, int age, String batch){
        this.id = id;
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    public Student clone() {
        return new Student(this);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
