package state;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class StateNameGen extends State {
    JButton buttonGenerateName, buttonBack;


    public StateNameGen(JFrame frame) {
        super(frame);
    }

    public void enter() {
        this.getFrame().removeAll();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
