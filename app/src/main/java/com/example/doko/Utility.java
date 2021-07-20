package com.example.doko;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Utility {
    private static final String STUDENTS = "students";
    public static Utility instance;

    private SharedPreferences sharedPreferences;

    public ArrayList<Student> getBatch(int start, int end) {
        ArrayList<Student> batch = new ArrayList<>();
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Student>>(){}.getType();
        ArrayList<Student> students = gson.fromJson(sharedPreferences.getString(STUDENTS, null),type);
        for (Student s: students) {
            if (s.getId() >= start && s.getId() <= end) {
                batch.add(s);
            }
        }
        return batch;
    }

    public ArrayList<Student> getStudents() {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Student>>(){}.getType();
        ArrayList<Student> students = gson.fromJson(sharedPreferences.getString(STUDENTS, null), type);
        return students;
    }

    public Utility(Context context) {
        sharedPreferences = context.getSharedPreferences("alternate_db", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();

        initData();
    }

    public static synchronized Utility getInstance(Context context) {
        if (null == instance) {
            instance = new Utility(context);
        }
        return instance;
    }

    private void initData() {
        ArrayList<Student> students = new ArrayList<>();
        //BCA 2022
        students.add(new Student(1, "Aakancha Thapa", "https://doko.dwit.edu.np/student/image/1202",
                "Kendriya Vidayala", "To become a successful BCA student.",
                "My Dad", "Singing, Internet Surfing, Traveling"));
        students.add(new Student(2, "Aaraj Bhattarai", "https://doko.dwit.edu.np/student/image/1267",
                "Kathmandu Model College", "To live a life of significance such that everybody is benefitted.",
                "Program Developer", "Bill Gates"));
        students.add(new Student(3, "Aayush Karki", "https://doko.dwit.edu.np/student/image/1251",
                "Kathmandu Bernhardt Higher Secondary School", "To become a creative programmer",
                "Watching and playing football.", "Sergio Aguero and Saurav Bhandari"));
        students.add(new Student(4, "Alina Pathak", "https://doko.dwit.edu.np/student/image/1252",
                "xavier international", "to be a good programmer",
                "explore", "my father"));
        students.add(new Student(5, "Anjana Shrestha", "https://doko.dwit.edu.np/student/image/1271",
                "Angels Heart Higher Secondary School", "To be a successful BCA Student.",
                "Mom and Dad", "Makeup Artists, Fashion Designer and traveling new places."));
        students.add(new Student(6, "Ankit Sharma", "https://doko.dwit.edu.np/student/image/1270",
                "Ideal Model HSS", "To be successful in the field of computers so as to fulfill everything on my bucket list.",
                "Jahseh Dwayne Onfroy", "Basketball, TT, Traveling, Admiring music."));
        students.add(new Student(7, "Arpan Dhakal", "https://doko.dwit.edu.np/student/image/1253",
                "Uniglobe HSS", "start a buisness",
                "Pewdiepie", "Football, movies,games"));

        //BCA 2023
        students.add(new Student(101, "Aishwarya Thapa", "https://doko.dwit.edu.np/student/image/1602",
                "Modern College of Management", "IT Officer",
                "Taylor Swift", "Singing, Songwriting"));
        students.add(new Student(102, "Anurag Giri", "https://doko.dwit.edu.np/student/image/1598",
                "Kathmandu Model College", "Software Developer",
                "Elon Musk", "Drawing, Painting, Games, Anime, Beatbox"));

        //BCA 2024
        students.add(new Student(201, "Aadhyashri Poudyal", "https://doko.dwit.edu.np/student/image/1614",
                "Chelsea International Academy", "Kathmandu", "I would like to have a good career in computing field , and grow both personally and professionally.",
                "Focused and observant as I tend to work with my attention undivided and notice even the small details.",
                "My Mother - Because she is a strong willed working woman who is confident in herself and the decisions she makes. Along with that she has taught me to never give up on things that I have started and stay humble.",
                "Dont't limit yourself within your thoughts, you are more than what you think."));

        Gson gson = new Gson();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(STUDENTS, gson.toJson(students));
        editor.commit();
    }
}
