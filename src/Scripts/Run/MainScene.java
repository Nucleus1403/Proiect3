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
        JFrame credits =new JFrame("Credits");
        credits.setSize(574,574);
        ImageIcon imag = new ImageIcon("src/Textures/Texture/TreiDegeaba.png");
        JLabel contentPane = new JLabel();
        contentPane.setIcon(imag);
        credits.add(contentPane);
        credits.setVisible(true);
        credits.setLocationRelativeTo(null);
        credits.setResizable(false);
        credits.setBackground(Color.black);
        contentPane.setBackground(Color.black);
    }

    private void ShowLeaderboard() {
    }

    public MainScene()
    {

         Parameters p = new Parameters();
        frame.setSize(p.getMainPixelSize(), p.getMainPixelSize()+70);


        InitializeButtonPanel();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void InitializeButtonPanel() {

        JPanel panel = new JPanel(new GridBagLayout());
        Border emptyBorder = BorderFactory.createEmptyBorder();
        TextureGetter textureGetter = new TextureGetter();

        ImageIcon img = new ImageIcon("src/Textures/Texture/background2.gif");
        JLabel contentPane = new JLabel();
        contentPane.setIcon(img);
        frame.add(contentPane);

        startgame = new JButton(textureGetter.getstarticon());
        startgame.setPreferredSize(new Dimension(100, 25));
        startgame.setBorder(emptyBorder);
        startgame.setBorderPainted(false);
        leaderboard = new JButton(textureGetter.getleaderboardicon());
        leaderboard.setPreferredSize(new Dimension(100, 25));
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

        frame.setResizable(false);
        frame.add(panel,BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.decode("#00050a"));
        panel.setBackground(Color.decode("#00050a"));



    }
}
