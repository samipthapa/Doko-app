package com.example.doko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailStudentNew extends AppCompatActivity {

    private ImageView studentImage;
    private TextView studentName, highSchool, hometown, goals, strength, idol, quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_student_new);
        initView();

        Intent intent = getIntent();
        if (null != intent) {
            int studentId = intent.getIntExtra("studentId", -1);
            if (studentId != -1) {
                Student student = Utility.getInstance(this).getStudentById(studentId);
                if (null != student) {
                    setData(student);
                }
            }
        }
    }

    public void initView() {
        studentName = findViewById(R.id.studentNameText2);
        highSchool = findViewById(R.id.highSchoolText2);
        hometown = findViewById(R.id.hometownText);
        goals = findViewById(R.id.goalsText);
        strength = findViewById(R.id.strengthText);
        idol = findViewById(R.id.idolText);
        quote = findViewById(R.id.quoteText);

        studentImage = findViewById(R.id.studentImage2);
    }

    public void setData(Student student) {
        studentName.setText(student.getName());
        hometown.setText(student.getHomeTown());
        highSchool.setText(student.getHighSchool());
        goals.setText(student.getGoals());
        strength.setText(student.getStrengths());
        idol.setText(student.getIdol());
        quote.setText(student.getQuote());

        Glide.with(this)
                .asBitmap().load(student.getImageUrl())
                .into(studentImage);
    }
}
