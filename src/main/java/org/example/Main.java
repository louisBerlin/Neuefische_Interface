package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Playable music = new MusicPlayer();

        Playable video = new VideoPlayer();


        play(music);
        music.play();


        
        play(video);
        video.play();


    }






    public static void  play(Playable p){
        p.play();
    }
}