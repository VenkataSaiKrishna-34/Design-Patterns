package RegistryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> students;

    StudentRegistry(){
        students = new HashMap<>();
    }

    public void add(String key, Student student){
        students.put(key, student);
    }

    public Student get(String key){
        return students.get(key).clone();
    }

    public void erase(String key){
        students.remove(key);
    }
}
