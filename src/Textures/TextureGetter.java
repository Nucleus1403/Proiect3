package Textures;

import javax.swing.*;
import java.awt.*;

public class TextureGetter implements ITextureGetter {

    public Image getCrate_open() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Crate.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getCrate_closed() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Crate check-0001.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getWall() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Wall.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getCharacter() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Extraterestru-0001.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getDot() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\dot-0001.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getTerrain_purple() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Teren 1.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Image getTerrain_red() {
        try{
            return new ImageIcon("D:\\School\\Modul 1\\OOP\\Laborator\\Proiect 3\\src\\Textures\\Texture\\Teren 2.png").getImage().getScaledInstance(32 ,32,Image.SCALE_DEFAULT);
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
