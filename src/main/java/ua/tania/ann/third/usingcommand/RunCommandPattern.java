package ua.tania.ann.third.usingcommand;

import ua.tania.ann.third.usingcommand.command.Command;
import ua.tania.ann.third.usingcommand.command.ReceiveSalaryCommand;
import ua.tania.ann.third.usingcommand.invoker.Secretary;
import ua.tania.ann.third.usingcommand.receiver.Worker;

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
