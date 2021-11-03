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

    public void moveCharacterRight()
    {
        actor= mapLoader.getActor();
        int positionX = actor.getPositionX();
        if(map[positionX+1][actor.getPositionY()].getType() == 1)
        {
            return;
        }
        if(map[positionX+1][actor.getPositionY()].getType() == 2)
            actor.setPositionX(positionX+1);
        isflag = true;
    }
    public void moveCharacterLeft()
    {
        actor= mapLoader.getActor();
        int positionX = actor.getPositionX();
    }
    public void moveCharacterUp()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
    }
    public void moveCharacterDown()
    {
        actor= mapLoader.getActor();
        int positionY = actor.getPositionY();
        int positionX = actor.getPositionX();
        if(map[positionX+1][positionY].getType() == 1)
        {
            return;
        }
        if(map[positionX+1][positionY].getType() == 2)
        {
            map[positionX][positionY].setType(2);
            map[positionX+1][positionY].setType(6);
            mapLoader.Draw();
        }
        if(map[positionX+1][positionY].getType() == 3)
        {
            map[actor.getPositionX()][positionY].setType(2);
            map[actor.getPositionX()][positionY+1].setType(6);
            mapLoader.Draw();
            isflag=true;
        }

        if(((map[actor.getPositionX()][positionY+1].getType() == 4) && map[actor.getPositionX()][positionY+2].getType() == 1))
        {
            return;
        }
        if((map[actor.getPositionX()][positionY+1].getType() == 4) && map[actor.getPositionX()][positionY+2].getType() == 2)
        {
            if(isflag == true)
            {
                map[actor.getPositionX()][positionY+2].setType(4);
                map[actor.getPositionX()][positionY+1].setType(6);
                map[actor.getPositionX()][positionY].setType(3);
                isflag = false;
            }
            else
            {
                map[actor.getPositionX()][positionY+2].setType(4);
                map[actor.getPositionX()][positionY+1].setType(6);
                map[actor.getPositionX()][positionY].setType(2);
            }
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 4) && map[actor.getPositionX()][positionY+2].getType() == 3))
        {
            if(isflag == true)
            {
                map[actor.getPositionX()][positionY+2].setType(5);
                map[actor.getPositionX()][positionY+1].setType(6);
                map[actor.getPositionX()][positionY].setType(3);
                isflag = false;
            }
            else
            {
                map[actor.getPositionX()][positionY+2].setType(5);
                map[actor.getPositionX()][positionY+1].setType(6);
                map[actor.getPositionX()][positionY].setType(2);
            }
        }
        if((map[actor.getPositionX()][positionY+1].getType() == 4) && map[actor.getPositionX()][positionY+2].getType() == 4)
        {
            return;
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 4) && map[actor.getPositionX()][positionY+2].getType() == 5))
        {
            return;
        }

        if(((map[actor.getPositionX()][positionY+1].getType() == 5) && map[actor.getPositionX()][positionY+2].getType() == 1))
        {
            return;
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 5) && map[actor.getPositionX()][positionY+2].getType() == 2))
        {
            if(isflag == true)
            {
                map[actor.getPositionX()][positionY+2].setType(4);
                map[actor.getPositionX()][positionY+1].setType(6);
                isflag = true;
                map[actor.getPositionX()][positionY].setType(3);
            }
            else
            {
                map[actor.getPositionX()][positionY+2].setType(4);
                map[actor.getPositionX()][positionY+1].setType(6);
                isflag = true;
                map[actor.getPositionX()][positionY].setType(2);
            }
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 5) && map[actor.getPositionX()][positionY+2].getType() == 3))
        {
            if(isflag == true)
            {
                map[actor.getPositionX()][positionY+2].setType(5);
                map[actor.getPositionX()][positionY+1].setType(6);
                isflag = true;
                map[actor.getPositionX()][positionY].setType(3);
            }
            else
            {
                map[actor.getPositionX()][positionY+2].setType(5);
                map[actor.getPositionX()][positionY+1].setType(6);
                map[actor.getPositionX()][positionY].setType(2);
                isflag = true;
            }
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 5) && map[actor.getPositionX()][positionY+2].getType() == 4))
        {
            return;
        }
        if(((map[actor.getPositionX()][positionY+1].getType() == 5) && map[actor.getPositionX()][positionY+2].getType() == 5))
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
