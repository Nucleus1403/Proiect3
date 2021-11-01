package Scripts.Run;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainRun {
    private GameArea ga;
    private GameFrame gf;
    Thread primary = new GameThread(ga, gf);
    public static void main(String[] args) {

    }
}
