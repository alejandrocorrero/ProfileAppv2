package com.correro.alejandro.profileapp.data;

import com.example.a2dam.contraintlayoutdemo.data.model.Student;

import java.util.ArrayList;

public class Database {

    private static Database instance;

    private ArrayList<User> students;

    private Database() {
        students = new ArrayList<>();

        students.add(new User("Baldomero", true));
        students.add(new User("Germán Ginés", false));
        students.add(new User("Genaro", true));

    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public void addStudent(User student) {
        students.add(student);
    }

    public void updateStudent(User student, int position) {
        students.set(position, student);
    }

    public void deleteStudent(int position) {
        students.remove(position);
    }

    public void insertStudent(User student, int position) {
        students.add(position, student);
    }
}
