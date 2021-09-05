package misha;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"    //выводим в контекст адрес конфигурации
        );
//        ClassicalMusic classicalMusic
//                = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());


        /* получаем из контекста то что реализует интерфейс Music */
        Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer.playMusic();
        musicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparsion = musicPlayer == musicPlayer1;
//
//        musicPlayer.playMusicList();
//        System.out.println(comparsion);
//

//        System.out.println(musicPlayer1);

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getValue());

//        musicPlayer.setValue(10);
//
//        System.out.println(musicPlayer.getValue());
//        System.out.println(musicPlayer1.getValue());

        context.close();
    }
}
