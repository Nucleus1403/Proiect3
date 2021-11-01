package Scripts.Run;

import Scripts.Framework.Parameters.Parameters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainScene {
    JFrame frame = new JFrame("MainMenu");
    private JButton startgame;
    private JButton leaderboard;
    private JButton credits;

    private final ActionListener actionListener = actionEvent -> {
        Object source = actionEvent.getSource();
        if (source == startgame) {
            Sokoban.getInstance().StartGame();
            
        }else if(source == leaderboard)
        {
            ShowLeaderboard();
        }else if(source == credits)
        {
            ShowCredits();
        }
    };

    private void ShowCredits() {
    }

    private void ShowLeaderboard() {
    }

    public MainScene()
    {
         Parameters p = new Parameters();
        frame.setSize(p.GetMainPixelSize(), p.GetMainPixelSize());

        InitializeButtonPanel();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void InitializeButtonPanel() {
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS);
        startgame = new JButton("Start Game");
        leaderboard = new JButton("Leaderboard");
        credits = new JButton("Credits");

        startgame.addActionListener(actionListener);
        leaderboard.addActionListener(actionListener);
        credits.addActionListener(actionListener);

        frame.add(startgame);
        frame.add(leaderboard);
        frame.add(credits);

        frame.setLayout(boxLayout);
        startgame.setAlignmentX(Component.CENTER_ALIGNMENT);
        startgame.setAlignmentY(Component.RIGHT_ALIGNMENT);
        leaderboard.setAlignmentX(Component.CENTER_ALIGNMENT);
        leaderboard.setAlignmentY(Component.CENTER_ALIGNMENT);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        credits.setAlignmentY(Component.CENTER_ALIGNMENT);
    }
    //new Sokoban();
    //new Leaderboard();
    //new Credits();
}
