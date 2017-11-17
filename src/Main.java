import state.StateManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private final int FRAMEHEGIHT = 860;
    private final int FRAMEWIDTH = 1300;

    private JFrame frame = new JFrame();
    private StateManager stateManager = new StateManager(frame);
    private Thread programThread = null;
    private JButton exit = new JButton("Exit");

    public Main() {
        frame.setSize(new Dimension(FRAMEWIDTH,FRAMEHEGIHT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        exit.addActionListener(this);
        frame.add(exit);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(exit)) {
            frame.dispose();
        }
    }
}
