package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    RecyclerView studentsList_rv;
    StudentAdapter studentAdapter;

    List<Student> studentList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        studentList.add(new Student("Samar Meqdad ","20151133","level fife","88"));//
        studentList.add(new Student("Osama Meqdad ","20161549","level four","80"));//
        studentList.add(new Student("lubna elfarra ","20154879","level fife","88"));//
        studentList.add(new Student("doha salah","20155498","level fife","90"));//
        studentList.add(new Student("diana mohamed ","20165489","level fife","93"));//
        studentList.add(new Student("rola samir ","2015114","level fife","77"));//


        studentsList_rv= findViewById(R.id.studentsList_rv);
        studentsList_rv.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new StudentAdapter(this ,studentList);
        studentsList_rv.setAdapter(  studentAdapter);
    }
}
