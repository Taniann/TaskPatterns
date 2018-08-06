package ua.tania.ann.fifth.command.command;

import ua.tania.ann.fifth.command.receiver.Worker;

/**
 * Created by Таня on 06.08.2018.
 */
public class ReceiveSalaryCommand implements Command {
    private Worker worker;

    public ReceiveSalaryCommand(Worker worker) {
        this.worker = worker;
    }

    public void execute() {
        worker.workWithAccountant();
    }
}
