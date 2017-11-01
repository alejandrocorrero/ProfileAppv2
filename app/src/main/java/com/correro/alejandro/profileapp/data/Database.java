package com.correro.alejandro.profileapp.data;

import com.correro.alejandro.profileapp.R;
import com.correro.alejandro.profileapp.data.model.User;
import java.util.ArrayList;

public class Database {

    private static Database instance;

    private ArrayList<User> users;

    private Database() {
        users = new ArrayList<User>();
        //TODO PRUEBA
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
        users.add(new User("alex","666666666","alejandro.correro@hotmail.com", R.drawable.cat1,"wwww.marca.com","avenida la cañada"));
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

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(User user, int position) {
        users.set(position, user);
    }

    public void deleteUser(int position) {
        users.remove(position);
    }

    public void insertUser(User user, int position) {
        users.add(position, user);
    }
}
