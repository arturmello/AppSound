package br.com.app.sound.models;

public class MyFavorites {

    public void include(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " is considered an absolute success, and preferred by all");
        } else{
            System.out.println(audio.getTitle() + " it's also one that everyone likes");
        }
    }
}
