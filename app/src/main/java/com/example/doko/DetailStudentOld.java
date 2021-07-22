package com.example.doko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailStudentOld extends AppCompatActivity {

    private ImageView studentImage;
    private TextView studentNameText, highSchoolText, goalsText, interestsText, idolText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_student_old);
        initView();

        Intent intent = getIntent();
        if (null != intent) {
            int studentId = intent.getIntExtra("studentId", -1);
            if (studentId != -1) {
                Student s = Utility.getInstance(this).getStudentById(studentId);
                if (null != s) {
                    setData(s);
                }
            }
        }
    }

    public void initView() {
        highSchoolText = findViewById(R.id.highSchoolText);
        goalsText = findViewById(R.id.goalsText);
        interestsText = findViewById(R.id.interestsText);
        idolText = findViewById(R.id.idolText);

        studentNameText = findViewById(R.id.studentNameText);

        studentImage = findViewById(R.id.studentImage);
    }

    public void setData(Student student) {
        studentNameText.setText(student.getName());
        highSchoolText.setText(student.getHighSchool());
        goalsText.setText(student.getGoals());
        interestsText.setText(student.getInterests());
        idolText.setText(student.getIdol());

        Glide.with(this)
                .asBitmap().load(student.getImageUrl())
                .into(studentImage);
    }

}