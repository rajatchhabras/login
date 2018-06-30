package com.example.dell.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
EditText user,pass;
Button login;
preferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText)findViewById(R.id.editText1);
        pass=(EditText)findViewById(R.id.editext2);
        login=(Button)findViewById(R.id.button);
        preferences=new preferences(getApplicationContext());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferences.createshareddata(user.getText().toString(),pass.getText().toString());
                Intent intent=new Intent(loginActivity.this,loged_in.class);
                String getinput=user.getText().toString();
                intent.putExtra( "value",getinput);

                startActivity(intent);
                finish();
            }
        });

    }
}
