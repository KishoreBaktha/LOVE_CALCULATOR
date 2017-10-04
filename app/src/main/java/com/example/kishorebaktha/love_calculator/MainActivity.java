package com.example.kishorebaktha.love_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView re;
    EditText f,m;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=(EditText) findViewById(R.id.editText);
        re=(TextView)findViewById(R.id.textView3);
        m=(EditText) findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(f.getText().toString().equals("")&&m.getText().toString().equals("")))
                {
                    String fem=f.getText().toString().trim();
                    String mal=m.getText().toString().trim();
                    Calendar c=Calendar.getInstance();
                    String day=String.valueOf(c.get(Calendar.DAY_OF_MONTH));
                    String month=String.valueOf(c.get(Calendar.MONTH));
                    String year=String.valueOf(c.get(Calendar.YEAR));
                    String result=fem+mal+day+month+year;
                    result=result.toLowerCase();
                    result=result.trim();
                    int seed=result.hashCode();
                    Random r=new Random(seed);
                    re.setText((r.nextInt(101)+1)+"%");

                }
            }
        });
    }
}
