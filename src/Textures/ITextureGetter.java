package Textures;

import javax.swing.*;
import java.awt.*;

public interface ITextureGetter {

    public Image getCrate_open();
    public Image getCrate_closed();
    public Image getWall(int type);
    public Image getCharacter();
    public Image getDot();
    public Image getTerrain();
    public ImageIcon getstarticon();
    public ImageIcon getleaderboardicon();
    public ImageIcon getcreditsicon();

}
