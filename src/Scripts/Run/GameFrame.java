package Scripts.Run;

import Scripts.Framework.CharacterMovement;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameFrame extends JFrame {
    private JPanel gameAreaPlaceholder;
    protected GameArea ga;
    protected CharacterMovement ch;
    private JLabel levelDisplay;

    public void startGame(GameArea ga)
    {
        new GameThread(ga, this).start();
    }
    private void initControls() {
        InputMap im = this.getRootPane().getInputMap();
        ActionMap am = this.getRootPane().getActionMap();

        im.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        im.put(KeyStroke.getKeyStroke("LEFT"), "left");
        im.put(KeyStroke.getKeyStroke("UP"), "up");
        im.put(KeyStroke.getKeyStroke("DOWN"), "down");

        am.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch.moveCharacterRight();
            }
        });
        am.put("left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch.moveCharacterLeft();
            }
        });
        am.put("up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch.moveCharacterUp();
            }
        });
        am.put("down", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch.moveCharacterDown();
            }
        });
    }
}
