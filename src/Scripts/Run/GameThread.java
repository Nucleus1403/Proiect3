package Scripts.Run;

public class GameThread extends Thread{
    private GameArea ga;
    private GameFrame gf;
    int level = 1;
    public GameThread(GameArea ga, GameFrame gf)
    {
        this.ga = ga;
        this.gf = gf;
    }
    @Override
    public void run()
    {
        while(true)
        {
            ga.createMap(level);
            ga.spawnCharacter();
        }
    }
}
