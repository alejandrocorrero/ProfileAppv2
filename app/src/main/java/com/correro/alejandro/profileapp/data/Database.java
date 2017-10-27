package com.correro.alejandro.profileapp.data;

import com.correro.alejandro.profileapp.data.model.User;
import java.util.ArrayList;

public class Database {

    private static Database instance;

    private ArrayList<User> users;

    private Database() {
        users = new ArrayList<User>();
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addStudent(User student) {
        users.add(student);
    }

    public void updateStudent(User student, int position) {
        users.set(position, student);
    }

    public void deleteStudent(int position) {
        users.remove(position);
    }

    public void insertStudent(User student, int position) {
        users.add(position, student);
    }
}
