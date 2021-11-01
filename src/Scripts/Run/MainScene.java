package Scripts.Run;

import Scripts.Framework.Parameters.Parameters;

import javax.imageio.ImageIO;
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
        //BoxLayout boxLayout = new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS);

        ImageIcon img = new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Background.gif");
        JLabel contentPane = new JLabel();
        contentPane.setIcon(img);
        frame.setContentPane(contentPane);

        JPanel panel = new JPanel(new GridBagLayout());

        startgame = new JButton("Start Game");
        startgame.setPreferredSize(new Dimension(100, 50));
        leaderboard = new JButton("Leaderboard");
        leaderboard.setPreferredSize(new Dimension(100, 50));
        credits = new JButton("Credits");
        credits.setPreferredSize(new Dimension(100, 50));

        startgame.addActionListener(actionListener);
        leaderboard.addActionListener(actionListener);
        credits.addActionListener(actionListener);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(10,10,10,10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(startgame,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(leaderboard,constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(credits,constraints);


        frame.add(panel);

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
