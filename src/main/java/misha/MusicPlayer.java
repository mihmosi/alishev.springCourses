package misha;

//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;

public class MusicPlayer {
    //    private Music music;
//    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
            System.out.println("Playing: " + music.getSong());
    }

    private Music music;

    public Music getMusic() {
        return music;
    }

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // IoC
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public MusicPlayer() {
    }



    public void setMusic(Music music) {
        this.music = music;
    }

//    public void playMusicList() {
//        for (Music song: musicList) {
//            System.out.println("Playing: " + song.getSong());
//        }
//    }

}
