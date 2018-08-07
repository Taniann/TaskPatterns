package ua.tania.ann.first.state;

import ua.tania.ann.first.state.context.Circumstance;
import ua.tania.ann.first.state.context.Human;

/**
 * Created by Таня on 07.08.2018.
 */
public class RunStatePattern {
    public static void main(String[] args) {
        Human human = new Human(Circumstance.ON_FIELD_WITH_MUSHROOMS);
        human.chooseNeededState();
        human.act();
        human.setCircumstance(Circumstance.BY_THE_RIVER);
        human.chooseNeededState();
        human.act();
    }
}
