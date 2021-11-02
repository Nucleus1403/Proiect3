package Scripts.Run;


import Scripts.Framework.Map.MapLoader;
import javax.swing.*;
import java.io.FileNotFoundException;

public class Sokoban extends JFrame{

    public static JFrame frame;

    public Sokoban()
    {
        frame = this;
        Initialize();
    }

    private void Initialize()
    {
        MapLoader map1 = null;
        try {
            map1 = new MapLoader(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        add(map1);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
