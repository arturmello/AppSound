package br.com.app.sound.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private  int totalLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getClassification() {
        return classification;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproductions++;
    }
}
