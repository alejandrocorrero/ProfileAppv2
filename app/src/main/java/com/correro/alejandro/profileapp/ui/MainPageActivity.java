package com.correro.alejandro.profileapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.correro.alejandro.profileapp.R;
import com.correro.alejandro.profileapp.data.Database;
import com.correro.alejandro.profileapp.data.model.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainPageActivity extends AppCompatActivity {

    @BindView(R.id.lvProfile)
    ListView lvProfile;
    @BindView(R.id.lblEmpty)
    TextView lblEmpty;
    private MainPageActivityAdapter adapter;
    private ArrayList<User> users = new ArrayList<>();
    private Database database;
    private static final int RC_PROFILE_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        users=loadStudents();
        setContentView(R.layout.activity_main_page);
        ButterKnife.bind(this);
        setupListView();
    }

    private void setupListView() {
        lvProfile.setEmptyView(lblEmpty);
        lvProfile.setOnItemClickListener((adapterView, view, position, id) -> editUser(adapter.getItem(position), position));
        adapter = new MainPageActivityAdapter(this, users);
        lvProfile.setAdapter(adapter);
    }
    private void editUser(User user, int position) {
        ProfileActivity.startForResult(this, RC_PROFILE_ACTIVITY, user, position);
    }

    private ArrayList<User> loadStudents() {
        database = Database.getInstance();
        Toast.makeText(this, "Cargando", Toast.LENGTH_SHORT).show();
        return database.getUsers();
    }
    @OnClick(R.id.lblEmpty)
    public void addNewUser(){
        ProfileActivity.startForResult(this, RC_PROFILE_ACTIVITY);
    }

}
