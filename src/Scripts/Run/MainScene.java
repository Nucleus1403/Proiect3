package Scripts.Run;

import Scripts.Framework.Parameters.Parameters;
import Textures.TextureGetter;

import javax.swing.*;
import javax.swing.border.Border;
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
            Sokoban game = new Sokoban();
            game.setVisible(true);

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
        frame.setSize(p.getMainPixelSize(), p.getMainPixelSize());


        InitializeButtonPanel();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void InitializeButtonPanel() {
        //BoxLayout boxLayout = new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS);

        JPanel panel = new JPanel(new GridBagLayout());
        Border emptyBorder = BorderFactory.createEmptyBorder();
        TextureGetter textureGetter = new TextureGetter();

        startgame = new JButton(textureGetter.getstarticon());
        startgame.setPreferredSize(new Dimension(100, 25));
        startgame.setBorder(emptyBorder);
        startgame.setBorderPainted(false);
        leaderboard = new JButton(textureGetter.getleaderboardicon());
        leaderboard.setPreferredSize(new Dimension(175, 25));
        leaderboard.setBorder(emptyBorder);
        leaderboard.setBorderPainted(false);
        credits = new JButton(textureGetter.getcreditsicon());
        credits.setPreferredSize(new Dimension(100, 25));
        credits.setBorder(emptyBorder);
        credits.setBorderPainted(false);

        startgame.addActionListener(actionListener);
        leaderboard.addActionListener(actionListener);
        credits.addActionListener(actionListener);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(20,20,20,20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(startgame,constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        panel.add(leaderboard,constraints);
        constraints.gridx = 3;
        constraints.gridy = 0;
        panel.add(credits,constraints);


        frame.add(panel,BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.decode("#161424"));
        panel.setBackground(Color.decode("#161424"));

      /*  frame.setLayout(boxLayout);
        startgame.setAlignmentX(Component.CENTER_ALIGNMENT);
        startgame.setAlignmentY(Component.RIGHT_ALIGNMENT);
        leaderboard.setAlignmentX(Component.CENTER_ALIGNMENT);
        leaderboard.setAlignmentY(Component.CENTER_ALIGNMENT);
        credits.setAlignmentX(Component.CENTER_ALIGNMENT);
        credits.setAlignmentY(Component.CENTER_ALIGNMENT); */
    }
    //new Sokoban();
    //new Leaderboard();
    //new Credits();
}
