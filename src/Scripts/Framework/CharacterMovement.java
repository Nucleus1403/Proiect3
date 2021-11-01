package Scripts.Framework;

import Scripts.Run.GameArea;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CharacterMovement {
    protected GameArea ga;
    public void moveCharacterRight()
    {
        ga.moveRight();
    }
    public void moveCharacterLeft()
    {
        ga.moveLeft();
    }
    public void moveCharacterUp()
    {
        ga.moveUp();
    }
    public void moveCharacterDown()
    {
        ga.moveDown();
    }
}
