package Scripts.Run;

import Scripts.Framework.InputSystem.SoundEffect;
import Scripts.Framework.Parameters.Parameters;
import Textures.TextureGetter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainScene {

    public JFrame frame = new JFrame("MainMenu");
    public JFrame maps =new JFrame("Maps");
    public JFrame credits =new JFrame("Credits");

    private JButton startGameButton;
    private JButton mapsButton;
    private JButton creditsButton;

    private JButton map1;
    private JButton map2;
    private JButton map3;
    private JButton map4;

    private SoundEffect soundEffect;

    private int mapNr=0;

    private final ActionListener actionListener = actionEvent -> {
        Object source = actionEvent.getSource();
        if (source == startGameButton) {
            Sokoban game;
            if(mapNr==0) {
                game = new Sokoban();
            }else
            {
                game = new Sokoban(mapNr);
            }
            game.setVisible(true);
            frame.setVisible(false);

        }else if(source == mapsButton)
        {
            ShowMaps();
        }else if(source == creditsButton)
        {
            ShowCredits();
            PlayCreditsMusic();
        }
        else if(source==map1)
        {
            System.out.println(2);
            mapNr=1;
            maps.setVisible(false);
        }
        else if(source==map2)
        {
            System.out.println(2);
            mapNr=2;
            maps.setVisible(false);
        }
        else if(source==map3)
        {
            System.out.println(3);
            mapNr=3;
            maps.setVisible(false);
        }
        else if(source==map4)
        {
            System.out.println(4);
            mapNr=4;
            maps.setVisible(false);
        }
        PlayButtonSound();
    };

    private void PlayButtonSound()
    {
        soundEffect.play("src/Textures/Sounds/button-10.wav");
    }

    private void PlayCreditsMusic()
    {
        soundEffect.play("src/Textures/Sounds/Rick Roll.wav");
    }

    private void ShowCredits()
    {
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

    private void ShowMaps() {

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

        maps.repaint();
    }

    public MainScene()
    {
        soundEffect = new SoundEffect();
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

        startGameButton = new JButton(textureGetter.getstarticon());
        startGameButton.setPreferredSize(new Dimension(100, 25));
        startGameButton.setBorder(emptyBorder);
        startGameButton.setBorderPainted(false);
        mapsButton = new JButton(textureGetter.getleaderboardicon());
        mapsButton.setPreferredSize(new Dimension(100, 25));
        mapsButton.setBorder(emptyBorder);
        mapsButton.setBorderPainted(false);
        creditsButton = new JButton(textureGetter.getcreditsicon());
        creditsButton.setPreferredSize(new Dimension(100, 25));
        creditsButton.setBorder(emptyBorder);
        creditsButton.setBorderPainted(false);

        startGameButton.addActionListener(actionListener);
        mapsButton.addActionListener(actionListener);
        creditsButton.addActionListener(actionListener);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(20,20,20,20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(startGameButton,constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        panel.add(mapsButton,constraints);
        constraints.gridx = 3;
        constraints.gridy = 0;
        panel.add(creditsButton,constraints);

        frame.setResizable(false);
        frame.add(panel,BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.decode("#00050a"));
        panel.setBackground(Color.decode("#00050a"));
    }
}
