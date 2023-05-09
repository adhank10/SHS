package com.example.tamanna.shs;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        bt1=(Button)findViewById(R.id.button1);




    }
    public void show(View v)
    {
        if(et1.getText().toString().equals("smart")&&
                et2.getText().toString().equals("home" +
                        ""))
        {
            Intent box=new Intent(MainActivity.this, secondActivity.class);
            startActivity(box);
        }
        else
        {
            Toast.makeText(this,"Try Again",Toast.LENGTH_SHORT).show();
        }
    }
}
