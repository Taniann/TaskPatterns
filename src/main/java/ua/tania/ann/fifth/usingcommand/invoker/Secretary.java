package ua.tania.ann.fifth.usingcommand.invoker;

import ua.tania.ann.fifth.usingcommand.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Таня on 06.08.2018.
 */
public class Secretary {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(final Command command) {
        this.history.add(command);
        command.execute();
    }
}
