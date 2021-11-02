package Textures;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TextureGetter implements ITextureGetter {

    public Image getCrate_open() {
        try{
            return new ImageIcon("src/Textures/Texture/crateopen.png").getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getCrate_closed() {
        try{
            return new ImageIcon("src/Textures/Texture/crateclosed.png").getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getWall() {
        try{
            Random rnd = new Random();
            int value = rnd.nextInt(0,3);

            ImageIcon iicon;

            switch (value)
            {
                case 1:
                    iicon = new ImageIcon("src/Textures/Texture/wall2.png");
                    break;

                case 2:
                    iicon = new ImageIcon("src/Textures/Texture/wall3.png");
                    break;

                default:
                    iicon = new ImageIcon("src/Textures/Texture/wall1.png");
                    break;

            }
            return iicon.getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getCharacter() {
        try{
            return new ImageIcon("src/Textures/Texture/ghost.png").getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public Image getDot() {
        try{
            return new ImageIcon("src/Textures/Texture/flag.png").getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getTerrain() {
        try{
            return new ImageIcon("src/Textures/Texture/Teren.png").getImage();
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
