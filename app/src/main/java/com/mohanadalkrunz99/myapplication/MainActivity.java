package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView student_name,student_id,student_level,student_avg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         String name = getIntent().getStringExtra("name");
        String id = getIntent().getStringExtra("id");
        String level = getIntent().getStringExtra("level");
        String avg = getIntent().getStringExtra("avg");

        student_name = findViewById(R.id.student_name);
        student_name.setText(name);
        student_id = findViewById(R.id.student_id);
        student_id.setText(id);
        student_level = findViewById(R.id.student_level);
        student_level.setText(level);
        student_avg = findViewById(R.id.student_avg);
        student_avg.setText(avg);


    }
}
