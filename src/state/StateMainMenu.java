package state;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class StateMainMenu extends State {
    private JButton buttonExit, buttonNameGen;

    public StateMainMenu(JFrame frame) {
        super(frame);

        buttonExit = new JButton("Exit");
        buttonExit.addActionListener(this);
        buttonNameGen = new JButton("Name Generator");
    }

    @Override
    public void enter() {
        this.getFrame().removeAll();
        this.getFrame().add(buttonExit);
        this.getFrame().add(buttonNameGen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
