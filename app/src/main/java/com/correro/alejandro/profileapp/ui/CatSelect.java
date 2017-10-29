package com.correro.alejandro.profileapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.correro.alejandro.profileapp.R;
import com.correro.alejandro.profileapp.data.model.Cat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CatSelect extends AppCompatActivity {

    @BindView(R.id.ivCat1)
    ImageView ivCat1;
    @BindView(R.id.ivCat2)
    ImageView ivCat2;
    @BindView(R.id.ivCat3)
    ImageView ivCat3;
    @BindView(R.id.ivCat5)
    ImageView ivCat5;
    @BindView(R.id.ivCat4)
    ImageView ivCat4;
    @BindView(R.id.ivCat6)
    ImageView ivCat6;
    @BindView(R.id.lblCat1)
    TextView lblCat1;
    @BindView(R.id.lblCat2)
    TextView lblCat2;
    @BindView(R.id.lblCat3)
    TextView lblCat3;
    @BindView(R.id.lblCat4)
    TextView lblCat4;
    @BindView(R.id.lblCat5)
    TextView lblCat5;
    @BindView(R.id.lblCat6)
    TextView lblCat6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_select);
        ButterKnife.bind(this);
        ivCat1.setTag(R.drawable.cat1);
        ivCat2.setTag(R.drawable.cat2);
        ivCat3.setTag(R.drawable.cat3);
        ivCat4.setTag(R.drawable.cat4);
        ivCat5.setTag(R.drawable.cat5);
        ivCat6.setTag(R.drawable.cat6);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int cat = extras.getInt("cat");
            if (cat == (Integer) ivCat1.getTag())
                ivCat1.setAlpha((float) 0.5);
            if (cat == (Integer) ivCat2.getTag())
                ivCat2.setAlpha((float) 0.5);
            if (cat == (Integer) ivCat3.getTag())
                ivCat3.setAlpha((float) 0.5);
            if (cat == (Integer) ivCat4.getTag())
                ivCat4.setAlpha((float) 0.5);
            if (cat == (Integer) ivCat5.getTag())
                ivCat5.setAlpha((float) 0.5);
            if (cat == (Integer) ivCat6.getTag())
                ivCat6.setAlpha((float) 0.5);
        }

    }
    @OnClick({R.id.ivCat3,R.id.lblCat3})
    public void cat3CLick(){
        intentForCat(new Cat((Integer) ivCat3.getTag(), lblCat3.getText().toString()));
    }

    private void intentForCat(Cat value) {
        Intent result = new Intent();
        result.putExtra("cat", value);
        setResult(RESULT_OK, result);
        finish();
    }

    @OnClick({R.id.ivCat1,R.id.lblCat1})
    public void cat1CLick(){
        intentForCat(new Cat((Integer) ivCat1.getTag(),lblCat1.getText().toString()));
    }
    @OnClick({R.id.ivCat2,R.id.lblCat2})
    public void cat2CLick(){
        intentForCat(new Cat((Integer) ivCat2.getTag(),lblCat2.getText().toString()));
    }
    @OnClick({R.id.ivCat4,R.id.lblCat4})
    public void cat4CLick(){
        intentForCat(new Cat((Integer) ivCat4.getTag(),lblCat4.getText().toString()));
    }
    @OnClick({R.id.ivCat5,R.id.lblCat5})
    public void cat5CLick(){
        intentForCat(new Cat((Integer) ivCat5.getTag(),lblCat5.getText().toString()));
    }
    @OnClick({R.id.ivCat6,R.id.lblCat6})
    public void cat6CLick(){
        intentForCat(new Cat((Integer) ivCat6.getTag(),lblCat6.getText().toString()));
    }

    //TODO REVISAR
//    @OnClick({R.id.ivCat1,R.id.ivCat2,R.id.ivCat3,R.id.ivCat4,R.id.ivCat5,R.id.ivCat6})
//    public void cat1CLick(View view){
//        intentForCat((Cat) view.getTag());
//    }

}
