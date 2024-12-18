package com.exam.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubAct extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    TextView t1;
    String st1,st2,st3;
    int a,b,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        b1=(Button) findViewById(R.id.sb1);
        b2=(Button) findViewById(R.id.sb2);
        e1=(EditText) findViewById(R.id.ets1);
        e2=(EditText) findViewById(R.id.ets2);
        t1=(TextView) findViewById(R.id.ress);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st1=e1.getText().toString();
                st2=e2.getText().toString();
                a=Integer.parseInt(st1);
                b=Integer.parseInt(st2);
                r=a-b;
                st3=Integer.toString(r);
                t1.setText(st3);
                Toast.makeText(getApplicationContext(),st3,Toast.LENGTH_LONG).show();
            }
        });


    }
}