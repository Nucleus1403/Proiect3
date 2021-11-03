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
    private int mapNr=0;

    private final ActionListener actionListener = actionEvent -> {
        Object source = actionEvent.getSource();
        if (source == startgame) {
            if(mapNr==0) {
                Sokoban game = new Sokoban();
                game.setVisible(true);
            }else
            {
                Sokoban game = new Sokoban(mapNr);
                game.setVisible(true);
            }
            frame.setVisible(false);

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

         JButton map1;
         JButton map2;
         JButton map3;
         JButton map4;

        JFrame maps =new JFrame("Maps");
        maps.setSize(526,800);
        ImageIcon imag2 = new ImageIcon("src/Textures/Texture/mapselect.png");
        JLabel contentPane = new JLabel();
        contentPane.setIcon(imag2);
        maps.add(contentPane);
        maps.setVisible(true);
        maps.setLocationRelativeTo(null);
        maps.setResizable(false);
        maps.setBackground(Color.black);
        contentPane.setBackground(Color.black);

        JPanel panel = new JPanel(new GridBagLayout());
        Border emptyBorder = BorderFactory.createEmptyBorder();
        TextureGetter textureGetter = new TextureGetter();


        map1 = new JButton(textureGetter.getmap1icon());
        map1.setPreferredSize(new Dimension(100, 25));
        map1.setBorder(emptyBorder);
        map1.setBorderPainted(false);
        map2 = new JButton(textureGetter.getmap2icon());
        map2.setPreferredSize(new Dimension(100, 25));
        map2.setBorder(emptyBorder);
        map2.setBorderPainted(false);
        map3 = new JButton(textureGetter.getmap3icon());
        map3.setPreferredSize(new Dimension(100, 25));
        map3.setBorder(emptyBorder);
        map3.setBorderPainted(false);
        map4 = new JButton(textureGetter.getmap4icon());
        map4.setPreferredSize(new Dimension(100, 25));
        map4.setBorder(emptyBorder);
        map4.setBorderPainted(false);

        map1.addActionListener(actionListener);
        map2.addActionListener(actionListener);
        map3.addActionListener(actionListener);
        map4.addActionListener(actionListener);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(20,20,20,20);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(map1,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(map2,constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(map3,constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(map4,constraints);

        maps.setResizable(false);
        maps.add(panel,BorderLayout.CENTER);

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
