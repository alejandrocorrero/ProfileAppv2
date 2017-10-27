package com.correro.alejandro.profileapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.correro.alejandro.profileapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainPageActivity extends AppCompatActivity {

    @BindView(R.id.lvProfile)
    ListView lvProfile;
    @BindView(R.id.lblEmpty)
    TextView lblEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        ButterKnife.bind(this);
        lvProfile.setEmptyView(lblEmpty);
    }

    public void addUser(){
        startActivity(intent);
    }
}
