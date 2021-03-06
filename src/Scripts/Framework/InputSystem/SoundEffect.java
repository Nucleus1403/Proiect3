package Scripts.Framework.InputSystem;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundEffect {

    private Clip clip;

    public void setFile(String soundFileName){

        try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch(Exception e){

        }
    }

    public void play(String soundFileName){

        setFile(soundFileName);
        clip.setFramePosition(0);
        clip.start();
    }

    public void stop(){

        setFile("src/Textures/Sounds/button-7.wav");
        clip.setFramePosition(0);
        clip.stop();
    }

}
