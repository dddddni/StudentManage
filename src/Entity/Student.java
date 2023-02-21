package Entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    private String name;
    private int age;
    private int number;
    private ArrayList<Subject> subjects;

    public Student(String name, int age, int number, ArrayList<Subject> subjects) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.subjects = subjects;
    }
}
