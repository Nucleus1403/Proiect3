package Scripts.Framework.Map;

/// 1->wall,2->terrain,3->dot,4->crate_open,5->crate_close,6->character
/// 7->terrainV2;

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

    public MapLoader()
    {}

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

        SizeX = sc.nextInt();
        SizeY = sc.nextInt();

        Map = new Cell[SizeX+1][SizeY+1];

        textureGetter = new TextureGetter();

        for (int i = 1; i <= SizeX; i++) {
            for (int j = 1; j <= SizeY; j++) {

                Data = sc.nextInt();

                Map[i][j]= new Cell();
                Map[i][j].type = Data;
            }
        }
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
                        g.drawImage(textureGetter.getWall(),2,2,this);
                        break;
                    case 2:
                        g.drawImage(textureGetter.getTerrainMainVersion(),i*32,j*32,this);
                        break;
                    case 3:
                        g.drawImage(textureGetter.getDot(),i*32,j*32,this);
                        break;
                    case 4:
                        g.drawImage(textureGetter.getCrate_open(),i*32,j*32,this);

                        break;
                    case 5:
                        g.drawImage(textureGetter.getCrate_closed(),i*32,j*32,this);

                        break;
                    case 6:
                        g.drawImage(textureGetter.getCharacter(),i*32,j*32,this);

                        break;
                    case 7:
                        g.drawImage(textureGetter.getTerrain_red(),i*32,j*32,this);
                        break;
                }
            }
        }
       // BufferedImage image = ImageIO.read(new File(path, "image.png"));
       // BufferedImage overlay = ImageIO.read(new File(path, "overlay.png"));

        // create the new image, canvas size is the max. of both image sizes
       // int w = Math.max(image.getWidth(), overlay.getWidth());
       // int h = Math.max(image.getHeight(), overlay.getHeight());
       // BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        // paint both images, preserving the alpha channels
       // Graphics g = combined.getGraphics();
       // g.drawImage(image, 0, 0, null);
       // g.drawImage(overlay, 0, 0, null);

    }



}
