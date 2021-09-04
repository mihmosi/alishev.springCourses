package misha;

public class MusicPlayer {
    private Music music;

    private  String name;
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
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
