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

public class Addact extends AppCompatActivity {

    EditText e1,e2;
    Button ba1,ba2;
    TextView t1;
    String s1,s2,s3;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addact);

        ba1=(Button) findViewById(R.id.ab1);
        ba2=(Button) findViewById(R.id.ab2);
        e1=(EditText) findViewById(R.id.eta1);
        e2=(EditText) findViewById(R.id.eta2);
        t1=(TextView) findViewById(R.id.resa);
        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                c=a+b;
                s3=Integer.toString(c);
                t1.setText(s3);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
            }
        });
    }
}