package Scripts.Run;

import javax.swing.*;

public class Sokoban {

    private static Sokoban instance=null;

    public static JFrame frame;
    public static Sokoban getInstance()
    {
        if(instance==null)
            return new Sokoban();
        return instance;
    }

    public void StartGame()
    {
        
    }



}
