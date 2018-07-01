package com.example.dell.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
EditText txt1,txt2,txt3,txt4;
Button save;
    String a,b,c,d;
preferences preferences;
sqldb sqldb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        sqldb=new sqldb(getApplicationContext());
        txt1=(EditText)findViewById(R.id.editText);
        txt2=(EditText)findViewById(R.id.pass);
        txt3=(EditText)findViewById(R.id.email);
        txt4=(EditText)findViewById(R.id.phone);
        save=(Button)findViewById(R.id.btn);
        a=txt1.getText().toString();
         b=txt2.getText().toString();
       c=txt3.getText().toString();
        d=txt4.getText().toString();
        sqldb.create(a);
        sqldb.insert(a,a,b,c,d);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(register.this,loged_in.class);
                startActivity(in);
               finish();

            }
        });

    }
}
