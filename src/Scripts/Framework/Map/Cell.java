package Scripts.Framework.Map;

public class Cell {
    private int type;

    public Cell(int type)
    {
        this.type = type;
    }
    public Cell()
    {

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
