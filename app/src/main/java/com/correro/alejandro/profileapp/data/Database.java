package com.correro.alejandro.profileapp.data;

import com.example.a2dam.contraintlayoutdemo.data.model.Student;

import java.util.ArrayList;

public class Database {

    private static Database instance;

    private ArrayList<Users> students;

    private Database() {
        students = new ArrayList<>();

        students.add(new Student("Baldomero", true));
        students.add(new Student("Germán Ginés", false));
        students.add(new Student("Genaro", true));

    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Student student, int position) {
        students.set(position, student);
    }

    public void deleteStudent(int position) {
        students.remove(position);
    }

    public void insertStudent(Student student, int position) {
        students.add(position, student);
    }
}
