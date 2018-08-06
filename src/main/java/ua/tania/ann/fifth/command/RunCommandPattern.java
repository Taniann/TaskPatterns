package ua.tania.ann.fifth.command;

import ua.tania.ann.fifth.command.command.Command;
import ua.tania.ann.fifth.command.command.ReceiveSalaryCommand;
import ua.tania.ann.fifth.command.invoker.Secretary;
import ua.tania.ann.fifth.command.receiver.Worker;

/**
 * Created by Таня on 06.08.2018.
 */
public class RunCommandPattern {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        Worker worker = new Worker();

        Command receiveSalary = new ReceiveSalaryCommand(worker);

        secretary.storeAndExecute(receiveSalary);
    }
}
