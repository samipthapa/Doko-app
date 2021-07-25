package com.example.doko;

public class ClubTenure {
    private String clubName;
    private String tenure;
    private String imageUrl;
    private String vision;
    private String mission;
    private String mentor;
    private String president;
    private String vicePresident;
    private String members;

    public ClubTenure(String clubName, String tenure, String imageUrl, String vision, String mission, String mentor, String president, String vicePresident, String members) {
        this.clubName = clubName;
        this.tenure = tenure;
        this.imageUrl = imageUrl;
        this.vision = vision;
        this.mission = mission;
        this.mentor = mentor;
        this.president = president;
        this.vicePresident = vicePresident;
        this.members = members;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getVicePresident() {
        return vicePresident;
    }

    public void setVicePresident(String vicePresident) {
        this.vicePresident = vicePresident;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }
}
