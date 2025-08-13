package Comportamentales.Command;

import Comportamentales.Command.Command.CommandInvoker;
import Comportamentales.Command.Databases.Mongo;
import Comportamentales.Command.Databases.Sql;

public class TestCommand {
    public static void main(String[] args) {
        Mongo mongo = new Mongo();
        Sql sql = new Sql();

        CommandInvoker commandInvoker = new CommandInvoker(mongo);

        System.out.println("---Mongo---");
        commandInvoker.executeCommand('S');
        commandInvoker.executeCommand('U');
        commandInvoker.executeCommand('A');


        commandInvoker =new CommandInvoker(sql);

        System.out.println("---sql---");
        commandInvoker.executeCommand('C');
        commandInvoker.executeCommand('D');

    }
}
