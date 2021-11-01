package Scripts.Run;

import javax.swing.*;
import java.awt.*;

public class MainScene {
    JFrame frame = new JFrame("MainMenu");
    public MainScene()
    {
        p = new Parameters();

        this.gridSize = p.GetGridSize();
        cells = new Cell[p.GetGridSize()][p.GetGridSize()];

        frame.setSize(p.GetPixelSize(), p.GetPixelSize());
        frame.setLayout(new BorderLayout());

        InitializeButtonPanel();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void InitializeButtonPanel() {
        JPanel buttonPanel = new JPanel();

        JButton reset = new JButton("Reset");
        JButton giveUp = new JButton("Give Up");

        reset.addActionListener(actionListener);
        giveUp.addActionListener(actionListener);

        buttonPanel.add(reset);
        buttonPanel.add(giveUp);
        frame.add(buttonPanel, BorderLayout.SOUTH);
    }
    //new Sokoban();
    //new Leaderboard();
    //new Credits();
}
