package Scripts.Framework.Map;

import java.awt.*;

public class Cell {
    public int type;
    public Image image;

    public Cell(int type)
    {
        this.type = type;
    }
    public Cell()
    {}

    public Cell(int type,Image img)
    {
        this.type =type;
        this.image = img;
    }
}
