package Scripts.Framework.InputSystem;

import Scripts.Framework.Character.CharacterMovement;
import Scripts.Run.Sokoban;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class InputSystem {

    public InputSystem()
    {
        initControls();
    }

    private void initControls()
    {
        InputMap im = Sokoban.frame.getRootPane().getInputMap();
        ActionMap am = Sokoban.frame.getRootPane().getActionMap();

        im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        im.put(KeyStroke.getKeyStroke("LEFT"), "left");
        im.put(KeyStroke.getKeyStroke("UP"), "up");
        im.put(KeyStroke.getKeyStroke("DOWN"), "down");

        am.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveRight();
            }
        });
        am.put("left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLeft();
            }
        });
        am.put("up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveUp();
            }
        });
        am.put("down", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveDown();
            }
        });

    }

    private void moveRight()
    {
        CharacterMovement.getInstance().moveCharacterRight();
    }
    private void moveLeft()
    {
        CharacterMovement.getInstance().moveCharacterLeft();
    }
    private void moveUp()
    {
        CharacterMovement.getInstance().moveCharacterUp();
    }
    private void moveDown()
    {
        CharacterMovement.getInstance().moveCharacterDown();
    }
}
