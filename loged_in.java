package com.example.dell.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class loged_in extends AppCompatActivity {
    preferences preferences;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged_in);
        b=(Button)findViewById(R.id.btn) ;

        preferences=new preferences(getApplicationContext());

        if(!preferences.login()) {
            Intent it = new Intent(loged_in.this, loginActivity.class);
            startActivity(it);
            finish();
        }
        else
        {
            //String st=getIntent().getExtras().getString("value");
            Toast t= Toast.makeText(getApplicationContext(), preferences.getUsername() ,Toast.LENGTH_SHORT);
            t.setGravity(Gravity.CENTER,0,0);
            t.show();
        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent its=new Intent(loged_in.this,loginActivity.class);
                startActivity(its);
                finish();
            }
        });




    }
}
