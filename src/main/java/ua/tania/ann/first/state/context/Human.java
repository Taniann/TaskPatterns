package ua.tania.ann.first.state.context;

import ua.tania.ann.first.state.state.Fisher;
import ua.tania.ann.first.state.state.Hunter;
import ua.tania.ann.first.state.state.Mushroomer;
import ua.tania.ann.first.state.state.State;

/**
 * Created by Таня on 07.08.2018.
 */
public class Human {
    State currentState;
    Circumstance circumstance;

    public Human() {
    }

    public Human(Circumstance circumstance) {
        this.circumstance = circumstance;
    }

    private void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setCircumstance(Circumstance circumstance) {
        this.circumstance = circumstance;
    }

    public void act() {
        currentState.act();
    }

    public void chooseNeededState() {
            switch (this.circumstance) {
                case BY_THE_RIVER:
                    setCurrentState(new Fisher());
                    break;
                case ON_FIELD_WITH_MUSHROOMS:
                    setCurrentState(new Mushroomer());
                    break;
                case SEES_THE_BEAST:
                    setCurrentState(new Hunter());
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }
}
