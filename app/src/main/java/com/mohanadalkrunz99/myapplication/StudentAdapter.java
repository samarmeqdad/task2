package com.mohanadalkrunz99.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVh> {

    Context context ;
    List<Student>studentList;
TextView student_name,student_id,student_level,student_avg;
    public StudentAdapter(Context context , List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.row_student, parent , false);
        return new StudentVh(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentVh holder, int position) {
        holder.setData(studentList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class StudentVh extends RecyclerView.ViewHolder{
      TextView  student_name , student_id , student_level , student_avg;
        public StudentVh(@NonNull View itemView) {
            super(itemView);
            student_name = itemView.findViewById(R.id. student_name);
            student_id  = itemView.findViewById(R.id.student_id );
            student_level  = itemView.findViewById(R.id.student_level );
            student_avg = itemView.findViewById(R.id. student_avg);
         }

        public void setData(final Student student) {
            student_name.setText(student.getName());
            student_id.setText(student.getId());
            student_level.setText(student.getLevel());
            student_avg.setText(student.getAvg());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, student.getName(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() ,MainActivity.class);
                    intent.putExtra("name",student.getName());
                    intent.putExtra("id",student.getId());
                    intent.putExtra("level",student.getLevel());
                    intent.putExtra("avg",student.getAvg());
                    itemView.getContext().startActivity(intent);
                }
            });


                }


    }
    }

