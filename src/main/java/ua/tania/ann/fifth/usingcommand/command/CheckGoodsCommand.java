package ua.tania.ann.fifth.usingcommand.command;

import ua.tania.ann.fifth.usingcommand.receiver.Worker;

/**
 * Created by Таня on 06.08.2018.
 */
public class CheckGoodsCommand implements Command {
    private Worker worker;

    public CheckGoodsCommand(Worker worker) {
        this.worker = worker;
    }

    public void execute() {
        worker.workWithStock();
    }
}
