package Scripts.Framework.Map;

public class Actor extends Cell{

    private int positionX;
    private int positionY;

    public Actor(int positionX,int positionY)
    {
        this.positionX = positionX;
        this.positionY = positionY;
        setType(6);
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
}
