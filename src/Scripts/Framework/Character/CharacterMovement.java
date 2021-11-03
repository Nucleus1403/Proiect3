package Scripts.Framework.Character;

import Scripts.Framework.Map.Actor;
import Scripts.Framework.Map.Cell;
import Scripts.Framework.Map.MapLoader;
import Scripts.Run.Sokoban;

import javax.swing.*;
import java.util.Map;

public class CharacterMovement {


    private static CharacterMovement instance=null;
    private static MapLoader mapLoader;
    private static  Actor actor;
    private static Cell[][] map;
    private boolean isflag = false;
    public static CharacterMovement getInstance()
    {
        if(instance==null)
            return new CharacterMovement();
        return instance;
    }

    public void moveCharacterDown()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
        int positionX = actor.getPositionX();
        if(map[positionX][positionY+1].getType() == 1 || map[positionX][positionY+1].getType() == 7 || map[positionX][positionY+1].getType() == 8)
        {
            return;
        }
        if(map[positionX][positionY+1].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX][positionY+1].setType(6);
                actor.setPositionY(positionY+1);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
        }
        if(map[positionX][positionY+1].getType() == 3)
        {
            if(isflag == true)
            {
                map[positionX][positionY].setType(3);
                map[positionX][positionY+1].setType(6);
                isflag=true;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else {
                map[positionX][positionY].setType(2);
                map[positionX][positionY + 1].setType(6);
                isflag = true;
                actor.setPositionY(positionY + 1);
                mapLoader.repaint();
            }
        }

        if((map[positionX][positionY+1].getType() == 4) && (map[positionX][positionY+2].getType() == 1) ||
                (map[positionX][positionY+1].getType() == 4) && (map[positionX][positionY+2].getType() == 7) ||
                (map[positionX][positionY+1].getType() == 4) && (map[positionX][positionY+2].getType() == 8))
        {
            return;
        }
        if((map[positionX][positionY+1].getType() == 4) && map[positionX][positionY+2].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX][positionY+2].setType(4);
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY+2].setType(4);
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY+1].getType() == 4) && map[positionX][positionY+2].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX][positionY+2].setType(5);
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY+2].setType(5);
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
        }
        if((map[positionX][positionY+1].getType() == 4) &&map[positionX][positionY+2].getType() == 4)
        {
            return;
        }
        if(((map[positionX][positionY+1].getType() == 4) && map[positionX][positionY+2].getType() == 5))
        {
            return;
        }

        if((map[positionX][positionY+1].getType() == 5) && (map[positionX][positionY+2].getType() == 1) ||
                (map[positionX][positionY+1].getType() == 5) && (map[positionX][positionY+2].getType() == 7) ||
                (map[positionX][positionY+1].getType() == 5) && (map[positionX][positionY+2].getType() == 8))
        {
            return;
        }
        if(((map[positionX][positionY+1].getType() == 5) && map[positionX][positionY+2].getType() == 2))
        {
            if(isflag == true)
            {
                map[positionX][positionY+2].setType(4);
                map[positionX][positionY+1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY+2].setType(4);
                map[positionX][positionY+1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY+1].getType() == 5) && map[positionX][positionY+2].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX][positionY+2].setType(5);
                map[positionX][positionY+1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY+2].setType(5);
                map[positionX][positionY+1].setType(6);
                map[positionX][positionY].setType(2);
                isflag = true;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY+1].getType() == 5) && map[positionX][positionY+2].getType() == 4))
        {
            return;
        }
        if(((map[positionX][positionY+1].getType() == 5) && map[positionX][positionY+2].getType() == 5))
        {
            return;
        }
    }
    public void moveCharacterUp()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
        int positionX = actor.getPositionX();
        if(map[positionX][positionY-1].getType() == 1 || (map[positionX][positionY-1].getType() == 7) || (map[positionX][positionY-1].getType() == 8))
        {
            return;
        }
        if(map[positionX][positionY-1].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
        }
        if(map[positionX][positionY-1].getType() == 3)
        {
            if(isflag == true)
            {
                map[positionX][positionY].setType(3);
                map[positionX][positionY-1].setType(6);
                isflag=true;
                actor.setPositionY(positionY+1);
                mapLoader.repaint();
            }
            else {
                map[positionX][positionY].setType(2);
                map[positionX][positionY - 1].setType(6);
                isflag = true;
                actor.setPositionY(positionY + 1);
                mapLoader.repaint();
            }
        }

        if(((map[positionX][positionY-1].getType() == 4) && (map[positionX][positionY-2].getType() == 1))||
                ((map[positionX][positionY-1].getType() == 4) && (map[positionX][positionY-2].getType() == 7))||
                ((map[positionX][positionY-1].getType() == 4) && (map[positionX][positionY-2].getType() == 8)))
        {
            return;
        }
        if((map[positionX][positionY-1].getType() == 4) && map[positionX][positionY-2].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX][positionY-2].setType(4);
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY-2].setType(4);
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY-1].getType() == 4) && map[positionX][positionY-2].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX][positionY-2].setType(5);
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY-2].setType(5);
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
        }
        if((map[positionX][positionY-1].getType() == 4) &&map[positionX][positionY-2].getType() == 4)
        {
            return;
        }
        if(((map[positionX][positionY-1].getType() == 4) && map[positionX][positionY-2].getType() == 5))
        {
            return;
        }

        if(((map[positionX][positionY-1].getType() == 5) && (map[positionX][positionY-2].getType() == 1)) ||
                ((map[positionX][positionY-1].getType() == 5) && (map[positionX][positionY-2].getType() == 7))||
                ((map[positionX][positionY-1].getType() == 5) && (map[positionX][positionY-2].getType() == 8)))
        {
            return;
        }
        if(((map[positionX][positionY-1].getType() == 5) && map[positionX][positionY-2].getType() == 2))
        {
            if(isflag == true)
            {
                map[positionX][positionY-2].setType(4);
                map[positionX][positionY-1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY-2].setType(4);
                map[positionX][positionY-1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(2);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY-1].getType() == 5) && map[positionX][positionY-2].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX][positionY-2].setType(5);
                map[positionX][positionY-1].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX][positionY-2].setType(5);
                map[positionX][positionY-1].setType(6);
                map[positionX][positionY].setType(2);
                isflag = true;
                actor.setPositionY(positionY-1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX][positionY-1].getType() == 5) && map[positionX][positionY-2].getType() == 4))
        {
            return;
        }
        if(((map[positionX][positionY-1].getType() == 5) && map[positionX][positionY-2].getType() == 5))
        {
            return;
        }
    }
    public void moveCharacterLeft()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
        int positionX = actor.getPositionX();
        if((map[positionX-1][positionY].getType() == 1) ||
                (map[positionX-1][positionY].getType() == 7) ||
                (map[positionX-1][positionY].getType() == 8))
        {
            return;
        }
        if(map[positionX-1][positionY].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
        }
        if(map[positionX-1][positionY].getType() == 3)
        {
            if(isflag == true)
            {
                map[positionX][positionY].setType(3);
                map[positionX-1][positionY].setType(6);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else {
                map[positionX][positionY].setType(2);
                map[positionX - 1][positionY].setType(6);
                isflag = true;
                actor.setPositionX(positionX - 1);
                mapLoader.repaint();
            }
        }

        if(((map[positionX-1][positionY].getType() == 4) && (map[positionX-2][positionY].getType() == 1))||
                ((map[positionX-1][positionY].getType() == 4) && (map[positionX-2][positionY].getType() == 7))||
                ((map[positionX-1][positionY].getType() == 4) && (map[positionX-2][positionY].getType() == 8)))
        {
            return;
        }
        if((map[positionX-1][positionY].getType() == 4) && map[positionX-2][positionY].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX-2][positionY].setType(4);
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX-2][positionY].setType(4);
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX-1][positionY].getType() == 4) && map[positionX-2][positionY].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX-2][positionY].setType(5);
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX-2][positionY].setType(5);
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
        }
        if((map[positionX-1][positionY].getType() == 4) &&map[positionX-2][positionY].getType() == 4)
        {
            return;
        }
        if(((map[positionX-1][positionY].getType() == 4) && map[positionX-2][positionY].getType() == 5))
        {
            return;
        }

        if(((map[positionX-1][positionY].getType() == 5) && (map[positionX-2][positionY].getType() == 1))||
                ((map[positionX-1][positionY].getType() == 5) && (map[positionX-2][positionY].getType() == 7))||
                ((map[positionX-1][positionY].getType() == 5) && (map[positionX-2][positionY].getType() == 8)))
        {
            return;
        }
        if(((map[positionX-1][positionY].getType() == 5) && map[positionX-2][positionY].getType() == 2))
        {
            if(isflag == true)
            {
                map[positionX-2][positionY].setType(4);
                map[positionX-1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX-2][positionY].setType(4);
                map[positionX-1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX-1][positionY].getType() == 5) && map[positionX-2][positionY].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX-2][positionY].setType(5);
                map[positionX-1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionX(positionX-1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX-2][positionY].setType(5);
                map[positionX-1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX-1);
                isflag = true;
                mapLoader.repaint();
            }
        }
        if(((map[positionX-1][positionY].getType() == 5) && map[positionX-2][positionY].getType() == 4))
        {
            return;
        }
        if(((map[positionX-1][positionY].getType() == 5) && map[positionX-2][positionY].getType() == 5))
        {
            return;
        }
    }
    public void moveCharacterRight()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
        int positionX = actor.getPositionX();
        if((map[positionX+1][positionY].getType() == 1)||
                (map[positionX+1][positionY].getType() == 7)||
                (map[positionX+1][positionY].getType() == 8))
        {
            return;
        }
        if(map[positionX+1][positionY].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
        }
        if(map[positionX+1][positionY].getType() == 3)
        {
            if(isflag == true)
            {
                map[positionX][positionY].setType(3);
                map[positionX+1][positionY].setType(6);
                isflag=true;
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
            else {
                map[positionX][positionY].setType(2);
                map[positionX + 1][positionY].setType(6);
                isflag = true;
                actor.setPositionX(positionX + 1);
                mapLoader.repaint();
            }
        }

        if(((map[positionX+1][positionY].getType() == 4) && (map[positionX+2][positionY].getType() == 1))||
                ((map[positionX+1][positionY].getType() == 4) && (map[positionX+2][positionY].getType() == 7))||
                ((map[positionX+1][positionY].getType() == 4) && (map[positionX+2][positionY].getType() == 8)))
        {
            return;
        }
        if((map[positionX+1][positionY].getType() == 4) && map[positionX+2][positionY].getType() == 2)
        {
            if(isflag == true)
            {
                map[positionX+2][positionY].setType(4);
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                actor.setPositionX(positionX+1);
                isflag = false;
                mapLoader.repaint();
            }
            else
            {
                map[positionX+2][positionY].setType(4);
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX+1][positionY].getType() == 4) && map[positionX+2][positionY].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX+2][positionY].setType(5);
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(3);
                isflag = false;
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX+2][positionY].setType(5);
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
        }
        if((map[positionX+1][positionY].getType() == 4) &&map[positionX+2][positionY].getType() == 4)
        {
            return;
        }
        if(((map[positionX+1][positionY].getType() == 4) && map[positionX+2][positionY].getType() == 5))
        {
            return;
        }

        if(((map[positionX+1][positionY].getType() == 5) && (map[positionX+2][positionY].getType() == 1))||
                ((map[positionX+1][positionY].getType() == 5) && (map[positionX+2][positionY].getType() == 7))||
                ((map[positionX+1][positionY].getType() == 5) && (map[positionX+2][positionY].getType() == 8)))
        {
            return;
        }
        if(((map[positionX+1][positionY].getType() == 5) && map[positionX+2][positionY].getType() == 2))
        {
            if(isflag == true)
            {
                map[positionX+2][positionY].setType(4);
                map[positionX+1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX+2][positionY].setType(4);
                map[positionX+1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(2);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX+1][positionY].getType() == 5) && map[positionX+2][positionY].getType() == 3))
        {
            if(isflag == true)
            {
                map[positionX+2][positionY].setType(5);
                map[positionX+1][positionY].setType(6);
                isflag = true;
                map[positionX][positionY].setType(3);
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
            else
            {
                map[positionX+2][positionY].setType(5);
                map[positionX+1][positionY].setType(6);
                map[positionX][positionY].setType(2);
                isflag = true;
                actor.setPositionX(positionX+1);
                mapLoader.repaint();
            }
        }
        if(((map[positionX+1][positionY].getType() == 5) && map[positionX+2][positionY].getType() == 4))
        {
            return;
        }
        if(((map[positionX+1][positionY].getType() == 5) && map[positionX+2][positionY].getType() == 5))
        {
            return;
        }
    }

    public void setMapLoader(MapLoader mapLoader) {
        this.mapLoader = mapLoader;
        setActor(mapLoader.getActor());
        map = mapLoader.Map;
    }

    public void setActor(Actor actor) {
        System.out.println(actor);
        this.actor = actor;
    }
}
