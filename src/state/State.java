package state;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class State implements ActionListener {
    private JFrame frame;

    State(JFrame frame) {
        this.frame = frame;
    }

    public abstract void enter();

    public JFrame getFrame() {
        return frame;
    }
}
