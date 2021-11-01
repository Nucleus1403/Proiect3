package Scripts.Framework.Character;

import Scripts.Run.Sokoban;

import javax.swing.*;

public class CharacterMovement {


    private static CharacterMovement instance=null;

    public static CharacterMovement getInstance()
    {
        if(instance==null)
            return new CharacterMovement();
        return instance;
    }

    public void moveCharacterRight()
    {

    }
    public void moveCharacterLeft()
    {

    }
    public void moveCharacterUp()
    {

    }
    public void moveCharacterDown()
    {

    }
}
