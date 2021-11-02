package Scripts.Framework.Map;

/// 1->wall,2->terrain,3->dot,4->crate_open,5->crate_close,6->character
/// 7->terrainV2;

import Scripts.Framework.Parameters.Parameters;
import Textures.TextureGetter;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapLoader extends JPanel {

    public static int SizeX;
    public static int SizeY;


    public static Cell[][] Map;

    private Scanner sc;
    private int Data;

    private TextureGetter textureGetter;
    private Parameters parameters;

    private int PixelSIze;

    public MapLoader()
    {

    }

    public MapLoader(int mapNr) throws FileNotFoundException {
        InitializeMap(mapNr);
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

        for (int i = 1; i <= SizeX; i++) {
            for (int j = 1; j <= SizeY; j++) {

                Data = sc.nextInt();

                Map[i][j]= new Cell();
                Map[i][j].type = Data;
            }
        }

        textureGetter = new TextureGetter();
        parameters= new Parameters();

        PixelSIze = parameters.getPixelSize();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Draw(g);
    }

    public void Draw(Graphics g)
    {
        g.setColor(new Color(250, 240, 170));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (int i = 1; i <= SizeX; i++) {
            for (int j = 1; j <= SizeY; j++) {
                switch (Map[i][j].type)
                {
                    case 1:
                        g.drawImage(textureGetter.getWall(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);
                        break;
                    case 2:
                        g.drawImage(textureGetter.getTerrain(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);
                        break;
                    case 3:
                        g.drawImage(textureGetter.getDot(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);
                        break;
                    case 4:
                        g.drawImage(textureGetter.getCrate_open(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);

                        break;
                    case 5:
                        g.drawImage(textureGetter.getCrate_closed(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);

                        break;
                    case 6:
                        g.drawImage(textureGetter.getCharacter(),(i*PixelSIze)+10,(j*PixelSIze)+10,this);

                        break;
                }
            }
        }
    }



}
