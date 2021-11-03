package Scripts.Run;


import Scripts.Framework.Character.CharacterMovement;
import Scripts.Framework.InputSystem.InputSystem;
import Scripts.Framework.Map.MapLoader;
import Scripts.Framework.Parameters.Parameters;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            mapLoader = new MapLoader(4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Parameters parameters = new Parameters();
        add(mapLoader);

        inputSystem = new InputSystem();
        CharacterMovement.getInstance().setMapLoader(mapLoader);

        setSize(mapLoader.getSizeX()*parameters.getPixelSize()+20, mapLoader.getSizeY()*parameters.getPixelSize()+42);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

}
