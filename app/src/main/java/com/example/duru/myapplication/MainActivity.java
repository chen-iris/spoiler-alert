package com.example.duru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button)findViewById(R.id. button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        button= (Button)findViewById(R.id. button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        button= (Button)findViewById(R.id. button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        button= findViewById(R.id. button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent1 = new Intent(this,Main3Activity.class);
        startActivity(intent1);
    }

    public void openActivity4() {
        Intent intent2 = new Intent(this,Main4Activity.class);
        startActivity(intent2);
    }

    public void openActivity5() {
        Intent intent3 = new Intent(this,Main5Activity.class);
        startActivity(intent3);
    }
}
