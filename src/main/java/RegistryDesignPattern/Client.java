package RegistryDesignPattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Student fallStudent1 = new Student(1, "NAME_1", 10, "Fall");
        Student springStudent2 = new Student(2, "NAME_2", 11, "Spring");

        studentRegistry.add("Fall", fallStudent1);
        studentRegistry.add("Spring", springStudent2);

        //Now if a new fall student joins
        //we will fetch the clone of existing fall student and update only the necessary details keeping the rest same
        Student fallStudent2 = studentRegistry.get("Fall");
        fallStudent2.setId(3);
        fallStudent2.setName("NAME_3");
        fallStudent2.setAge(11);

    }
}
