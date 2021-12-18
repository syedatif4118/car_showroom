package com.example.car_showroom;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();
        String txt=intent.getStringExtra("Chiron");
        TextView textView=(TextView)findViewById(R.id.textView5);
        textView.setText(txt);
        Intent intent1=getIntent();
        String txt2=intent.getStringExtra("Mac");
        TextView textView2=(TextView)findViewById(R.id.textView5);
        textView2.setText(txt2);
        Intent intent2=getIntent();
        String txt3=intent.getStringExtra("tri");
        TextView textView3=(TextView)findViewById(R.id.textView5);
        textView3.setText(txt3);
        Intent intent3=getIntent();
        String txt4=intent.getStringExtra("gtr");
        TextView textView4=(TextView)findViewById(R.id.textView5);
        textView4.setText(txt4)