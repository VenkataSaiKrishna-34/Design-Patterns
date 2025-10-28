package PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(1, "Venkat", 24);

        //Below is just a shallow copy [copying the object reference]
//        Student studentCopy = student;

        //This will create and return a new copy of the student object. this a fully deep copy.
        Student studentCopy = student.clone();

        SmartStudent smartStudent = new SmartStudent(100, 1);
        SmartStudent smartStudent2 = smartStudent.clone();
    }
}
