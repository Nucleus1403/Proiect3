package Scripts.Run;

public class Sokoban {

    private static Sokoban instance=null;

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
