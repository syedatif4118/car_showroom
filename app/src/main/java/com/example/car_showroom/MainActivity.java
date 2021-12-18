package com.example.car_showroom;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.image1);
        img2=findViewById(R.id.image2);
        img3=findViewById(R.id.image3);
        img4=findViewById(R.id.image4);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new
                        Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Chiron","Bugatti Chiron\n Blue \n ExShowroom:10cr \n On-Road:11.1cr");
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new
                        Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Mac","Mac 720s\n red \n Ex-Showroom:4cr \n OnRoad:4.5cr");
                startActivity(intent);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new
                        Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Tri","Ferrai Tributo\n red \n Ex-Showroom:3cr \nOn-Road:3.5cr");
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new
                        Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Gtr","GTR\n silver \n Ex-Showroom:1cr \n OnRoad:1.5cr");
                startActivity(intent);
            }
        });
    }
}