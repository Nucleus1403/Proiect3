package Scripts.Framework.Map;

public class Actor extends Cell{

    private int[][] position;

    public Actor(int positionX,int positionY)
    {
        position = new int[positionX][positionY];
        setType(6);
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public int[][] getPosition() {
        return position;
    }
}
