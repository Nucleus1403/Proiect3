package Scripts.Run;


import Scripts.Framework.Character.CharacterMovement;
import Scripts.Framework.InputSystem.InputSystem;
import Scripts.Framework.Map.MapLoader;
import javax.swing.*;
import java.io.FileNotFoundException;

public class Sokoban extends JFrame{

    public static JFrame frame;
    public static MapLoader mapLoader;
    public static InputSystem inputSystem;

    public Sokoban()
    {
        frame = this;
        Initialize();
    }

    private void Initialize()
    {
        try {
            mapLoader = new MapLoader(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        add(mapLoader);

        inputSystem = new InputSystem();
        CharacterMovement.getInstance().setMapLoader(mapLoader);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
