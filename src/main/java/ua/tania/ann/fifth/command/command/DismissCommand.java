package ua.tania.ann.fifth.command.command;

import ua.tania.ann.fifth.command.receiver.Worker;

/**
 * Created by Таня on 06.08.2018.
 */
public class DismissCommand implements Command {
    private Worker worker;

    public DismissCommand(Worker worker) {
        this.worker = worker;
    }

    public void execute() {
        worker.workWithDirector();
    }
}
