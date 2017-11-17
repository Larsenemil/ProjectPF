package state;

import javax.swing.*;
import java.util.ArrayList;

public class StateManager {
    private ArrayList<State> states = new ArrayList<>();
    private States currentState;

    public StateManager(JFrame frame) {
        states.add(0, new StateNameGen(frame));
    }

    public States getCurrentState() {
        return currentState;
    }

    public void setCurrentState(States currentState) {
        this.currentState = currentState;
    }

    public enum States {
        MainMenu,
        NameGen
    }
}
