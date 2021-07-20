package com.example.doko;

public class Student {
    private int id;
    private String name;
    private String imageUrl;
    private String highSchool;
    private String homeTown;
    private String goals;
    private String strengths;
    private String idol;
    private String quote;
    private String interests;

    public Student(int id, String name, String imageUrl, String highSchool, String homeTown, String goals, String strengths, String idol, String quote) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.highSchool = highSchool;
        this.homeTown = homeTown;
        this.goals = goals;
        this.strengths = strengths;
        this.idol = idol;
        this.quote = quote;
    }

    public Student(int id, String name, String imageUrl, String highSchool, String goals, String idol, String interests) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.highSchool = highSchool;
        this.goals = goals;
        this.idol = idol;
        this.interests = interests;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getIdol() {
        return idol;
    }

    public void setIdol(String idol) {
        this.idol = idol;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "Student{" +
                "highSchool='" + highSchool + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", goals='" + goals + '\'' +
                ", strengths='" + strengths + '\'' +
                ", idol='" + idol + '\'' +
                ", quote='" + quote + '\'' +
                ", interests='" + interests + '\'' +
                '}';
    }
}
