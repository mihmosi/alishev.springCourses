package misha;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"    //выводим в контекст адрес конфигурации
        );
        /* получаем из контекста то что реализует интерфейс Music */
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());

        context.close();
    }
}
