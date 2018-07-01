package com.example.dell.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

public class sqldb {
    Context context;
    SQLiteDatabase db;
    preferences preferences;
    sqldb(Context context)
    {
        this.context=context;
        db=context.openOrCreateDatabase("userdb",Context.MODE_PRIVATE,null);
    }
    void create(String tablenam)
    {
        try
        {
            db.execSQL("CREATE TABLE IF NOT EXISTS " +tablenam+ "(user varchar2(20),pass varchar2(20),email varchar(30),phone varchar(11))");

        }catch(Exception e) {
            throw e;
        }
    }
    void insert(String tablenam,String user,String pass,String email,String phone)
    {
        db.execSQL("INSERT INTO " +tablenam+ " VALUES('" +user+ "','" +pass+ "','" +email+ "','" +phone+ "')");
    }
}
