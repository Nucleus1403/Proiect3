package Scripts.Framework.Character;

import Scripts.Framework.Map.Actor;
import Scripts.Framework.Map.Cell;
import Scripts.Framework.Map.MapLoader;
import Scripts.Run.Sokoban;

import javax.swing.*;
import java.util.Map;

public class CharacterMovement {


    private static CharacterMovement instance=null;
    private MapLoader mapLoader;
    private Actor actor;
    private Cell[][] map = MapLoader.Map;
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
        if(map[actor.getPositionX()][positionY+1].getType() == 1)
        {
            return;
        }
        if(map[actor.getPositionX()][positionY+1].getType() == 2)
        {
            actor.setPositionY(positionY+1);
        }
    }

    public void setMapLoader(MapLoader mapLoader) {
        this.mapLoader = mapLoader;
        setActor(mapLoader.getActor());
    }

    public void setActor(Actor actor) {
        System.out.println(actor);
        this.actor = actor;
    }
}
