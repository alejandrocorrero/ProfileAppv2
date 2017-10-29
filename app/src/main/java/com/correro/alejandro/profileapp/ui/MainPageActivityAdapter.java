package com.correro.alejandro.profileapp.ui;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.correro.alejandro.profileapp.R;
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
        return data == null ? 0 : data.size();
}

    @Override
    public User getItem(int position) {
        return data.get(position);
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
    public void setData(ArrayList<User> newData) {
        data = newData;
        notifyDataSetChanged();
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
        TextView lblEmail;
        TextView lblPhone;
        ImageView ivAvatar;

        public ViewHolder(View itemView) {
            lblName = (TextView) itemView.findViewById(R.id.lblName);
            lblEmail = (TextView) itemView.findViewById(R.id.lblEmail);
            lblPhone = (TextView) itemView.findViewById(R.id.lblPhone);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
        }

        public void bind(User user) {
            lblName.setText(user.getName());
            lblEmail.setText(user.getEmail());
            lblPhone.setText(user.getPhone());
            ivAvatar.setImageResource(user.getAvatar());

        }
    }

}
