package br.com.app.sound.main;

import br.com.app.sound.models.Music;
import br.com.app.sound.models.MyFavorites;
import br.com.app.sound.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("04AM");
        myMusic.setSinger("Matuê");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 1000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 500; i++) {
            myPodcast.like();
        }

        MyFavorites favorite = new MyFavorites();
        favorite.include(myPodcast);
        favorite.include(myMusic);
    }
}
