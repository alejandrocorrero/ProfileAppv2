package com.correro.alejandro.profileapp.ui;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.correro.alejandro.profileapp.data.model.User;

import java.util.ArrayList;

public class MainPageActivityAdapter extends BaseAdapter {
    ArrayList<User> data;
    private final LayoutInflater layoutInflater;

    public MainPageActivityAdapter(Context context, @NonNull ArrayList<User> data) {
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        // Si no puedo reciclar.
        if (convertView == null) {
            // Inflar.
            convertView = layoutInflater.inflate(R.layout.activity_main_item, parent, false);
            viewHolder = onCreateViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Escribir.
        onBindViewHolder(position, viewHolder);

        // Retorna la vista ya configurada.
        return convertView;
    }

    @NonNull
    private ViewHolder onCreateViewHolder(View convertView) {
        ViewHolder viewHolder;
        viewHolder = new ViewHolder(convertView);
        return viewHolder;
    }

    private void onBindViewHolder(int position, ViewHolder viewHolder) {
        viewHolder.bind(data.get(position));
    }

    static class ViewHolder {
        //TODO AÑADIR CON BUTTERNAI
        TextView lblName;
        TextView lblRepeater;

        public ViewHolder(View itemView) {
            lblName = (TextView) itemView.findViewById(R.id.lblName);
            lblRepeater = (TextView) itemView.findViewById(R.id.lblRepeater);
        }

        public void bind(User user) {
            lblName.setText(user.getName());

        }
    }

}
