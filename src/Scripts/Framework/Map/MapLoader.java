package Scripts.Framework.Map;

/// 1->wall,2->terrain,3->dot,4->crate_open,5->crate_close,6->character
/// 7->wall2,8->wall3;

import Scripts.Framework.Parameters.Parameters;
import Textures.TextureGetter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapLoader extends JPanel {

    public static int SizeX;
    public static int SizeY;

    public static Cell[][] Map;
    public Timer timer;

    private Scanner sc;
    private int Data;

    private Actor actor;

    private TextureGetter textureGetter;
    private Parameters parameters;

    private int PixelSIze;
    private int seconds;

    private JLabel contentPane;

    public MapLoader(int mapNr) throws FileNotFoundException {
        InitializeMap(mapNr);
        InitializeTimer();
        setFocusable(true);
    }

    public void InitializeMap(int mapNUmber) throws FileNotFoundException
    {

        switch (mapNUmber)
        {
            case 1:
                sc = new Scanner(new File("src/Levels/Map1"));
                break;
            case 2:
                sc = new Scanner(new File("src/Levels/Map2"));
                break;
            case 3:
                sc = new Scanner(new File("src/Levels/Map3"));
                break;
            case 4:
                sc = new Scanner(new File("src/Levels/Map4"));
                break;
        }

        SizeY = sc.nextInt();
        SizeX = sc.nextInt();

        Map = new Cell[SizeX+1][SizeY+1];

        for (int i = 0; i < SizeX; i++) {
            for (int j = 0; j < SizeY; j++) {

                Data = sc.nextInt();

                Map[i][j]= new Cell();
                Map[i][j].setType(Data);

                if(Data==6)
                {
                    actor = new Actor(i,j);
                }
            }
        }

        textureGetter = new TextureGetter();
        parameters= new Parameters();
        PixelSIze = parameters.getPixelSize();

    }
    private void InitializeTimer()
    {
        contentPane = new JLabel();
        contentPane.setSize(100,100);
        contentPane.setFont(new Font("Calibri", Font.BOLD, 35));
        contentPane.setText("");
        add(contentPane);

        timerClock();
        timer.start();
    }


    public void timerClock()
    {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                contentPane.setText(toStringSeconds());
                System.out.println(seconds);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Draw(g);
    }

    public void Draw(Graphics graphics)
    {
        graphics.setColor(new Color(7,75,88));
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (int i = 0; i < SizeX; i++) {
            for (int j = 0; j < SizeY; j++) {
                switch (Map[i][j].getType())
                {
                    case 1:
                        graphics.drawImage(textureGetter.getWall(0),(i*PixelSIze)+4,(j*PixelSIze)+4,this);
                        break;
                    case 2:
                        graphics.drawImage(textureGetter.getTerrain(),(i*PixelSIze)+4,(j*PixelSIze)+4,this);
                        break;
                    case 3:
                        graphics.drawImage(textureGetter.getDot(),(i*PixelSIze)+4,(j*PixelSIze)+4,this);
                        break;
                    case 4:
                        graphics.drawImage(textureGetter.getCrate_open(),(i*PixelSIze)+4,(j*PixelSIze)+4,this);

                        break;
                    case 5:
                        graphics.drawImage(textureGetter.getCrate_closed(),(i*PixelSIze)+4,(j*PixelSIze)+4,this);

                        break;
                    case 6:
                        graphics.drawImage(textureGetter.getCharacter(),(i*PixelSIze)+4,(j*PixelSIze)+4,this);

                        break;

                    case 7:
                        graphics.drawImage(textureGetter.getWall(1),(i*PixelSIze)+4,(j*PixelSIze)+4,this);

                        break;
                    case 8:
                        graphics.drawImage(textureGetter.getWall(2),(i*PixelSIze)+4,(j*PixelSIze)+4,this);

                        break;
                }
            }
        }
    }

    public String toStringSeconds() {
        return String.valueOf(seconds);
    }

    public Actor getActor() {
        return actor;
    }

    public static int getSizeX() {
        return SizeX;
    }

    public static int getSizeY() {
        return SizeY;
    }
}
